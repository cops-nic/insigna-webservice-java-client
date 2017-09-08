package test;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ClientAutenticationCallBack implements CallbackHandler {
	
	@Override
	public void handle(Callback[] cbArray) {
		WSPasswordCallback passwordCallback = (WSPasswordCallback) cbArray[0];
		// Password que se usa para acceder a INSIGNA
		passwordCallback.setPassword("password");
		
		// User que se usa para acceder a INSIGNA
		passwordCallback.setIdentifier("usuario");
	}
}
