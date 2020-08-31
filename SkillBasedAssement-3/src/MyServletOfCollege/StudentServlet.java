package MyServletOfCollege;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypackage.College.Attendence.Attendence;
import mypackage.College.AttendenceInsert.AttendenceInsertion;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AttendenceInsertion atd=new AttendenceInsertion();
		String semester=request.getParameter("Semester");
		String date=request.getParameter("Date");
		java.util.Date Date=null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date=sdf.parse(date);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Date not Found");
		}
		if(atd.SearchResultBySemester(semester,Date)==null){
			HttpSession session=request.getSession();
			session.setAttribute("NoRecords", atd.SearchResultBySemester(semester, Date));
			RequestDispatcher rd= request.getRequestDispatcher("RecordNotFound.jsp");
			rd.forward(request, response);
		}
		else {
			ArrayList<Attendence> attendancedata=atd.SearchResultBySemester(semester, Date);
		HttpSession session=request.getSession();
		session.setAttribute("attendancedata", attendancedata);
		
		RequestDispatcher rd1= request.getRequestDispatcher("RecordFound.jsp");
		rd1.forward(request, response);
		}
	}
}