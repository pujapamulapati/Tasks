package EmployeeRegistration;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	    String data=request.getParameter("Name");
	    out.println("Employee Name:"+data);
	    String data1=request.getParameter("ID");
	    out.println("Employee ID:"+data1);
	    String data2=request.getParameter("Address");
	    out.println("Employee Address:"+data2);
		String password=request.getParameter("Password");
	    out.println("Employee Password Saved");
	    String Cpassword=request.getParameter("ConfirmPassword");
	    out.println("Employee Password Confirmed");
	    String gender[]= request.getParameterValues("Gender");
	    out.println("Gender:");
	    for(String a:gender)
	    {
	    out.println(a);
	    }
	    String arr[]= request.getParameterValues("languagesKnown");
	    out.println("Language Known:");
	    for(String a1:arr)
	    {
	    out.println(a1);
	    }
	    String date=request.getParameter("Date Of Birth");
	    out.println("Employee Date Of Birth:"+date);
	    String arr1[]= request.getParameterValues("SecurityQuestion");
	    out.println("Security Question Selected:");
	    for(String a11:arr1)
	    {
	    out.println(a11);
	    }
	    String SAnswer=request.getParameter("SecurityAnswer");
	    out.println("Security Answer:"+SAnswer);
	    }
}