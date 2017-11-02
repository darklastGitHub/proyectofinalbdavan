package co.edu.avanzada.standalone.util;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class ServiceLocator {
	
	private static final String APP_NAME = "proyecto-EAR";
	private static final String MODULE_NAME = "proyecto-EJB";
	private static final String DISTINCT_NAME = "";

	
	public static Object buscarEJB(String nombreClase,String interfaceRemota) throws NamingException{
		Properties prop = new Properties();
		prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

		
		Context context = new InitialContext(prop);
		return context.lookup("ejb:" + APP_NAME + "/" + MODULE_NAME
				+ "/" + DISTINCT_NAME + "/" + nombreClase + "!" + interfaceRemota);
	}

}
