package com.demo.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class TestLocalization {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		ApplicationContext ctx= new ClassPathXmlApplicationContext("springconfig.xml");
		MessageSource ms=(MessageSource)ctx.getBean(ResourceBundleMessageSource.class);
		System.out.println("1.India Marathi \n2. US English \n3.UK English \n4.Others\nchoice:");
		int choice =sc.nextInt();
		Locale locale=null;
		switch(choice) {
		case 1:{
			locale = new Locale("my","marathi");
			System.out.println("country name: "+locale.getCountry()+"  language: "+locale.getLanguage());
			break;
		}
		case 2:{
			locale = Locale.US;
			System.out.println("country name: "+locale.getCountry()+" language: "+locale.getLanguage());
			break;
		}
		case 3:{
			locale =Locale.UK;
			System.out.println("country name: "+locale.getCountry()+" language: "+locale.getLanguage());
			break;
		}
		
	}
		//retrieve messages assigned to appropriate keys in requires message file
		 String msg1=ms.getMessage("msg.pay",null, locale);
		 String welcomemsg=ms.getMessage("msg.welcome",new Object[] {"Shruti"}, locale);
		 String billmsg= ms.getMessage("msg.billmsg",null, locale);
		 String currency= ms.getMessage("msg.currency",null, locale);
		 
		//display ,messages retrieved from .properties file
	        
	        System.out.println(msg1);
	        System.out.println(welcomemsg);
	        System.out.println(billmsg);
	        double amount=sc.nextDouble();
	        System.out.println("Your bill amount : "+ amount+" "+currency+"is receieved");
	}

}
