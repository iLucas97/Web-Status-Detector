package it.ilucas.conf;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import it.ilucas.checker.ServersSingleton;

@Configuration
public class ConfigurationAppl {
	 @Bean
	    public ServersSingleton accountServiceSingleton() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		 Constructor<ServersSingleton> cxor = ServersSingleton.class.getDeclaredConstructor();
	
		 cxor.setAccessible(true);
		 return (ServersSingleton) cxor.newInstance();
	    }
	 
}
