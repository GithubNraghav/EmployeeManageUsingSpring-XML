package com.raghav.empManagespring;

import java.util.List;

public interface Admindao 
{
	public Employee getemployee(int userid);
	
	public List<Employee> getAllemloyee();
	public int insertEmployee(Employee emp);
	public void deleteEmployee( int userid);
	public void updateEmployee(Employee emp) ;
}
