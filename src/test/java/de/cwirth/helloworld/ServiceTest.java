package de.cwirth.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServiceTest {

	@Test
	public void test() {
		HelloWorld service = new HelloWorldImpl();
		String answer = service.sayHello("Hello");
		assertEquals("World", answer);
	}

}
