package com.raghav.empManagespring;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeControllerServletContainer 
{

	
	
	@RequestMapping("/login")
	public String getEmployeeLogin()
	{
		System.out.println("inside getlogin method");
		return "EmployeeManagementLogin";
	}
	
	
	
	@RequestMapping("/verifyServlet")
	public String verifyuser(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("userid") int userid)
	{
		
		System.out.println("in verify servelt.");
		
		Userverify uv=new Userverify();
		Employee employee = uv.getemployee(userid);
		
		if(employee.getType().equals("admin"))
		{
			return "AdminPage";
		}
		
		else 
		{
			return "EmployeePage";
		}
		
		
		
	}
	

	// that could be the reason for direct hyperlink is not working as it used to work in traditional jsp and servlet application .
	
	
	
	@RequestMapping(value="/getEmployeepage")
	public String getemployeePage() 
	{
		
		
		return "getEmployeepage";
	}
	
	//2.
	@RequestMapping(value="/getAllemployee")
	public String getAllemployeePage() 
	{
		
		
		return "getAllemployee";
	}
	
	//3
	@RequestMapping(value="/insertemppage")
	public String insertEmployeePage() 
	{
		
		
		return "insertemppage";
	}
	
	//4
	@RequestMapping(value="/updateemppage")
	public String updateEmployeePage() 
	{
		
		
		return "updateemppage";
	}
	
	//5
	@RequestMapping(value="/deleteemppage")
	public String deleteEmployeePage() 
	{
		
		
		return "deleteemppage";
	}
	
	
	
	
	// this is AdminSevlet
	
	@RequestMapping(value="/Adminservlet")
	public String  AdminServlet(@RequestParam("button") String button,HttpServletRequest request,HttpServletResponse resposne, Model  model) 
	{
		Admindao admindao = new AdminDaoImpl();
		
		
		if(button.equals("fetch")) 
		{
			
			
			
			
			int userid = Integer.parseInt(request.getParameter("userid"));
			
			
			
			
			Employee emp=admindao.getemployee(userid);
			
			


			
			model.addAttribute("empdetails",emp);
			
			return "displayemployee";
			
			
		}
		
		else if(button.equals("fetchAll"))
		{
			
			// call adao.getAllemployee
			
			List<Employee> allemloyee = admindao.getAllemloyee();
			
			model.addAttribute("listofemp",allemloyee);
		
			return "displayAllemployee";
		}
		
		
		else if(button.equals("inseretEmp")) 
		{
			// call insert here
		
		
		
			Employee emp=new Employee();
			emp.setUsername(request.getParameter("uname"));
			emp.setPassword(request.getParameter("upass"));
			emp.setType(request.getParameter("utype"));
			emp.setUserid(Integer.parseInt(request.getParameter("userid")));
			int insertedEmployee = admindao.insertEmployee(emp);
			model.addAttribute("numberOfempInserted", insertedEmployee);
			
			return "displayinsertedemployee";
		}
			
	
		else if(button.equals("deleteEmp")) 
		{
			// call delete here
			int userid = Integer.parseInt(request.getParameter("userid"));
			admindao.deleteEmployee(userid);
			//model.addAttribute("deletedEmp","");
			return "displaydeletedemployee";
			
		}
		
		
		else if(button.equals("updateEmp")) 
		{
			// call update here
			
			Employee emp=new Employee();
			emp.setUsername(request.getParameter("uname"));
			emp.setPassword(request.getParameter("upass"));
			emp.setType(request.getParameter("utype"));
			emp.setUserid(Integer.parseInt(request.getParameter("userid")));
			admindao.updateEmployee(emp);
			//model.addAttribute("updatedemp",updatedEmployee);
			
			return "displayUpdatedemployee";
			
		}
		
		else 
		{
			System.out.println("this operation is not supportted/invalid operation");
			return "errorPage";
		}
		
		
	}
	
}














