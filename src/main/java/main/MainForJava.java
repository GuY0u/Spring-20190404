package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import calculator.MyCalculator;
import config.AppCtx;

public class MainForJava {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppCtx.class);
		
		MyCalculator myCalculator =
				ctx.getBean("myCalculator",MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		
		ctx.close();
	}

}
