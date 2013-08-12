package net.sas.model.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextUtil {
	
	private static ApplicationContext context;
	
	private ContextUtil(){
		context = new ClassPathXmlApplicationContext("/WEB-INF/applicationContext.xml");
	}
	
	public static ApplicationContext getInstance(){
		if(context == null)
			new ContextUtil();
		return context;
	}

}
