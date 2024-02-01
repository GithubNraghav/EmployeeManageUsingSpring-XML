package com.raghav.empManagespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.*;
public class Userverify 
{

	
	// in this project I have to use spring framework to develop Employee managemnt project 
	
	// control will not start from main method , as usual as its a web project 
	// request comes from browser to server from server control comes to servlet 
	
	
	//front end remains the same// I have to only implement backend// java part of code using spring.
	//all jsp page remains the same.
	
	//even In spring I have to use Spring MVC archetecture to implement code  and spring ORMor springJDBC in order to connect database .
	
	
	// I will create two projects one with spring jdbc a
	 //and another with Spring ORM. 
	
	
	//here n this class  I have to checkthe credentials coming from the servlet 
	
	
	//I have to create a dispatcherservelt first // basically create a MVC web architecture flow// and then later model implementation we can do , once the view and controller is in place// VC flow first then later comes the model implementation.
	
	
	//JDBCTemplate.save();
	public Employee getemployee(int userid) 
	{
	
		String query="select * from employee where userid=?";
		ApplicationContext context=new ClassPathXmlApplicationContext("com/raghav/empManagespring/DispatcherServletSpringconfig-servlet.xml");
		
		
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
		RowMapper rowMapper = new RowMapperImpl();
		Employee emp =jdbcTemplate.queryForObject(query,rowMapper,userid);// need to pass the object of row mapper, which takes the result set object// or objects if that a list // and map it to the user defined type in the row mapper class.
		
		//System.out.println(emp);
		// to get a single row  from a table// i need to use query for object method .
		
		//and for getting a list // need to use query method.
		
		
		
		
		return emp;
		 
	}
	
	 
	
	
	
	
	
}
