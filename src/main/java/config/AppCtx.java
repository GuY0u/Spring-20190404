package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import calculator.Calculator;
import calculator.MyCalculator;

@Configuration //컨테이너로 사용한다
public class AppCtx {
	
	@Bean
	public Calculator calculator() {
		return new Calculator();
	}
	
	@Bean
	public MyCalculator myCalculator() {
		MyCalculator myCalc = new MyCalculator();
		myCalc.setCalculator(calculator());
		myCalc.setFirstNum(10);
		myCalc.setSecondNum(5);
		return myCalc;
	}
}
