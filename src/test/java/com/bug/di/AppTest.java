package com.bug.di;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
		
        assertTrue( true );
		System.out.println("################");
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student student=(Student)context.getBean("abc");
		Address as=(Address)context.getBean("address");
		student.show();
		System.out.println("################");
		
    }
}
