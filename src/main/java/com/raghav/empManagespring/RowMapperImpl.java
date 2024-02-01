package com.raghav.empManagespring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Employee>

{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException 
	
	{
		Employee emp=new Employee();
		emp.setUsername(rs.getString("username"));
		emp.setPassword(rs.getString("password"));
		emp.setType(rs.getString("type"));
		emp.setUserid(rs.getInt("userid"));
		
		
		return emp;
	}

	
	
}
