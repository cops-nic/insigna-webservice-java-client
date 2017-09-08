package test;

import java.util.HashMap;
import java.util.Map;

import mx.certipass.ws.CfdiInfoResult;
import mx.certipass.ws.CfdiInfoWrapper;
import mx.certipass.ws.InsignaSOAPWS;
import mx.certipass.ws.OperationFailedException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

public class InsignaClient {
	public static void main(String args[]) {
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(InsignaSOAPWS.class);
		// URL de producción: https://ws.insigna.mx/services?wsdl
		String wsURL = "https://beta.ws.insigna.mx/services?wsdl";
		factory.setAddress(wsURL);
		factory.getInInterceptors().add(new LoggingInInterceptor());
		
		Map<String, Object> outProps = new HashMap<String, Object>();
		outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		outProps.put(WSHandlerConstants.USER, "username ");
		outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
		outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientAutenticationCallBack.class.getName());
		
		WSS4JOutInterceptor loggingOutInterceptor = new WSS4JOutInterceptor(outProps);
		factory.getOutInterceptors().add(loggingOutInterceptor);
		
		InsignaSOAPWS webService = (InsignaSOAPWS) factory.create();
		Client client = ClientProxy.getClient(webService);
		HTTPConduit conduit = (HTTPConduit) client.getConduit();
		HTTPClientPolicy policy = new HTTPClientPolicy();
		policy.setConnectionTimeout(1000000L);
		policy.setReceiveTimeout(1000000L);
		policy.setAllowChunking(false);
		conduit.setClient(policy);
		CfdiInfoWrapper wrapper = new CfdiInfoWrapper();
		wrapper.setUuid("753e9e17-39f2-44f1-91fe-c7c0bec617a0");
		wrapper.setTransactionId("CII1");
		
		try {
			CfdiInfoResult result = webService.getCfdiInfo(wrapper);
			System.out.println("Cfdi: " + result.getCfdi());
			System.out.println("Estatus: " + result.getCfdiStatus());
			System.out.println("Código de respuesta: " + result.getResponseCode());
			System.out.println("Descripción de la respuesta: " + result.getResponseDescription());
			System.out.println("Transaction ID: " + result.getTransactionId());
			System.out.println("Server transaction ID: " + result.getServerTransactionId());
			System.out.println("Fecha de consulta: " + result.getRequestDate());
			System.out.println("Fecha de respuesta: " + result.getResponseDate());
			System.out.println("Tiempo de ejecución: " + result.getExecutionTime());
			
		} catch (OperationFailedException fault) {
			System.out.println("Código: " + fault.getFaultInfo().getErrorCode());
			System.out.println("Mensaje: " + fault.getFaultInfo().getErrorDescription());
		}
	}
}
