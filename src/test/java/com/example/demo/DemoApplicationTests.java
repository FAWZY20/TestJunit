package com.example.demo;

import com.example.demo.Service.Calculatrice;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Priority;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private Calculatrice calculatrice;

	@Test
	@Description("addition")
	public void TestAdittion() {
		Integer a = 10;
		Integer b = 19;
		Integer result = calculatrice.adittion(a, b);
		System.out.println(result);
		assertEquals(result, a + b, "le resulta n'est pas bon");
	}

	@Test
	@Description("soustraction")
	public void  TestSoustraction(){
		Integer a = 10;
		Integer b = 19;
		Integer result = calculatrice.soustraction(a, b);
		System.out.println(result);
		assertEquals(result, a - b, "le resulta n'est pas bon");
	}

	@Test
	@Description("Multiplication")
	public void  TestMultiplication(){
		Integer a = 10;
		Integer b = 19;
		Integer result = calculatrice.multiplication(a, b);
		System.out.println(result);
		assertEquals(result, a * b, "le resulta n'est pas bon");
	}

}
