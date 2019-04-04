package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import calculator.MyCalculator;

public class MainForXML {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:AppCtx.xml");
		
		MyCalculator myCalculator =
				ctx.getBean("myCalculator",MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		
		ctx.close();
	}

}
