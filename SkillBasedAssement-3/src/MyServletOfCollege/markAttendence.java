package MyServletOfCollege;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypackage.College.Attendence.Attendence;
import mypackage.College.AttendenceInsert.AttendenceInsertion;

@WebServlet("/markAttendence")
public class markAttendence extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public markAttendence() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		AttendenceInsertion atd=new AttendenceInsertion();
		String[] data=request.getParameterValues("status");
		for(String attd:data) {
			int studentId=Integer.parseInt(attd);
			Attendence attend=new Attendence(studentId);
			atd.UpdateAttendanceOfStudent(attend);
		}
		RequestDispatcher rd= request.getRequestDispatcher("UpdatedSuccessful.jsp");
		rd.forward(request, response);
	}
}

