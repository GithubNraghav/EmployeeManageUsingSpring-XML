package com.raghav.empManagespring;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class DBConnection 
{

@Autowired
@Qualifier("jdbcTemplate")
public JdbcTemplate jdbcTemplate;
@Autowired
@Qualifier("hibernateTemplate")// name of the bean you wana inject // as by default // IOC inject using Type.
public HibernateTemplate hibernateTemplate;




public JdbcTemplate getJdbcTemplate() 
{
	return jdbcTemplate;
}
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}
public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

@Override
public String toString() {
	return "DBConnection [jdbcTemplate=" + jdbcTemplate + ", hibernateTemplate=" + hibernateTemplate + "]";
}
	
//1
public Employee getemployee(int userid)
{
	

	Employee emp =(Employee) this.hibernateTemplate.get(Employee.class, userid);
	 
	
//	hibernate Template works  but only for read only operations// cannot write any values in database until We use @transactional?
	
	return emp;
	
	
}

//2.

public List<Employee> getAllemloyee()
{
	
	List<Employee> listofemp =this.hibernateTemplate.loadAll(Employee.class);
	
	return listofemp;
	
	
	
}

//3

	
@Transactional
public int insertEmployee(Employee emp)
{
	
	
	int empinserted = (int) this.hibernateTemplate.save(emp);
	
	return empinserted;
}



//the problem was// @ transactional annotation on method and hibernate template has to be in the same class
// as hibernatre session will change if hibernateTemplate object is coming from another class and
// insert method(method on which @transactional is written is in another class.





//4

@Transactional
public void deleteEmployee( int userid)
{

	
	Employee emp=this.hibernateTemplate.load(Employee.class,userid);
	
	this.hibernateTemplate.delete(emp);
	
// hibernateTemplate.delete doesnt return anything.	
	  
}


//5 

@Transactional
public void updateEmployee(Employee emp) 
{
	
	this.hibernateTemplate.update(emp);

	
}





	
}//class ends here
