package com.raghav.empManagespring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

public class Utilityconnection 
{
	
   
	public JdbcTemplate getJdbcconnection() 	

	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/empManagespring/DispatcherServletSpringconfig-servlet.xml");
		
		DBConnection dbconnection = context.getBean("dbconnection",DBConnection.class);
		JdbcTemplate jdbcTemplate = dbconnection.getJdbcTemplate();
		return jdbcTemplate;
	}

	
	public HibernateTemplate gethibernateconnection() 
	{
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/empManagespring/DispatcherServletSpringconfig-servlet.xml");
		DBConnection connection = context.getBean("dbconnection",DBConnection.class);
		HibernateTemplate hibernateTemplate = connection.getHibernateTemplate();
		return hibernateTemplate;
		
		
		
	}


	
	
	
	// cannot sue autowirre to as getting error.. need to check that again// I can autowire// but i need to cll the bean of the class which is autowiring the jdbc template// in this case its utitlity class//
	// but I am unable to make that secnario // cos of the classes that are not aligned properly.
	
	
	
	
	
	
	
	
	// please note, this class is not used at all.
	
	
}
