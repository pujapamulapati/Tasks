package MyServletOfCollege;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypackage.College.Attendence.Attendence;
import mypackage.College.AttendenceInsert.AttendenceInsertion;
import mypackage.College.StudentDetails.StudentsData;

import java.util.ArrayList;
import java.util.Date;


@WebServlet("/MarkAttendance")
public class MarkAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MarkAttendance() {
        super();
        // TODO Auto-generated constructor stub
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AttendenceInsertion atd=new AttendenceInsertion();
		String Semester=request.getParameter("Semester");
	
		ArrayList<StudentsData> studentdata=atd.getStudentsDataBySemester(Semester);
		for(StudentsData stud:studentdata) 
		{
			int studentId=stud.getStudentID();
			String studentName=stud.getStudentName();
			String semesterNum=Semester;
			String dept=stud.getDepartment();
			String attendence="Absent";
			Date DateAttendencetaken=new Date();
			
			Attendence attend= new Attendence(studentName,studentId, semesterNum,dept,attendence,DateAttendencetaken);
			atd.InsertIntoAttendence(attend);
		}
		HttpSession session=request.getSession();
		session.setAttribute("studentdata", studentdata);
		RequestDispatcher rd= request.getRequestDispatcher("DisplayStudentsforAttendence.jsp");
		rd.forward(request, response);
	
	}

}