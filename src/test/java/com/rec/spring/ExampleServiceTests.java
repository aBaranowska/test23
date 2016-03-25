package com.rec.spring;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ExampleServiceTests {

	private ApplicationContext context;

	@Before
	public void setUp() {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
	}

	@After
	public void tearDown() {
		((AbstractApplicationContext) context).close();
	}

	@Test
	public void checkInstances() {
		Service bean1 = context.getBean(Service.class);
		Service bean2 = context.getBean(Service.class);
		assertFalse(bean1 == bean2);
	}

}
