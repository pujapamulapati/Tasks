package MyServletOfCollege;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypackage.College.StudentDetails.StudentsData;
import mypackage.College.StudentInsert.StudentInsertion;



@WebServlet("/InsertionDetails")
public class InsertionDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InsertionDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String StudentName=request.getParameter("studentName");
		int StudentID=Integer.parseInt(request.getParameter("studentID"));
		String Semester=request.getParameter("semester");
		String  Department= request.getParameter("department");
		
		StudentsData student= new StudentsData(StudentName, StudentID, Semester, Department);
		PrintWriter out=response.getWriter();;
		response.setContentType("text/html");
		StudentInsertion dao=new  StudentInsertion();
		out.print(dao.createNewStudent(student));
		RequestDispatcher rd= request.getRequestDispatcher("SuccessfulCreated.jsp");
		rd.forward(request, response);
	}

}
