package test;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {
	
	public static void main(String args[]) {
		WSDLToJava.main(new String[] { "-d", "src", "C:/X/INSIGNAWS.wsdl"});
		System.out.println("finished");
	}
	
}
