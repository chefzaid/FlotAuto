package net.sas.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextUtil {
	
	private static ApplicationContext context;
	
	private ContextUtil(){
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public static ApplicationContext getInstance(){
		if(context == null)
			new ContextUtil();
		return context;
	}

}
