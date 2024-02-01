package com.raghav.empManagespring;



import java.io.Serializable;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.annotations.FlushModeType;
import org.springframework.beans.factory.annotation.Autowired;

//import javax.transaction.Transactional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



public class AdminDaoImpl implements Admindao
{
	

	ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/empManagespring/DispatcherServletSpringconfig-servlet.xml");
	
	

	//1get employee
	public Employee getemployee(int userid)
	{
		
		
		DBConnection connection = this.context.getBean("dbconnection",DBConnection.class);
		
		Employee emp = connection.getemployee(userid);

		return emp;
		
		
	}
	
	//2 get all employee
	
	public List<Employee> getAllemloyee()
	{
		

		
		
	DBConnection connection = this.context.getBean("dbconnection",DBConnection.class);
		
	List<Employee> listofemp= connection.getAllemloyee();
		
	return listofemp;
		
		
		
	}
	
	

	
	public int insertEmployee(Employee emp) 
	{
		
		
		
		DBConnection dbconnection = this.context.getBean("dbconnection",DBConnection.class);
		
		int Num_empinserted = dbconnection.insertEmployee(emp);
		
		
		return Num_empinserted;
		 
	
		
	}
	
	
	//4 delete employee
	
	public void deleteEmployee( int userid)
	{

		
		DBConnection dbconnection = this.context.getBean("dbconnection",DBConnection.class);
		
		dbconnection.deleteEmployee(userid);
		
	// hibernateTemplate.delete doesnt return anything.	
		  
	}
	
	
	
	//5 update employee details
	
	public void updateEmployee(Employee emp) 
	{
		

		DBConnection dbconnection = this.context.getBean("dbconnection",DBConnection.class);
		
		dbconnection.updateEmployee(emp);

		
	}
	
	
	  
	
	
}
