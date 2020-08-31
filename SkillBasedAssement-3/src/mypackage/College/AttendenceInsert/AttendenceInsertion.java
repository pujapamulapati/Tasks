package mypackage.College.AttendenceInsert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import mypackage.College.Attendence.Attendence;
import mypackage.College.DBConnt.dbConnection;
import mypackage.College.StudentDetails.StudentsData;
public class AttendenceInsertion {
		public ArrayList<StudentsData> getStudentsDataBySemester(String Semester){
			try {
				Connection connection=dbConnection.getConnect();
				String sql="select * from StudentsData where Semester=?";
				PreparedStatement stat=connection.prepareStatement(sql);
				stat.setString(1, Semester);
				ResultSet rs=stat.executeQuery();
				ArrayList<StudentsData> studentListdata=new ArrayList<>();
				while(rs.next()) {
					int studentId=rs.getInt("StudentID");
					String studentName=rs.getString("StudentName");
					String studentDep=rs.getString("Department");
					StudentsData students=new StudentsData(studentName,studentId,Semester,studentDep);
					studentListdata.add(students);
				}
				return studentListdata;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public String UpdateAttendanceOfStudent(Attendence attendance) {
			try {
				Connection conncetion=dbConnection.getConnect();
				String sql="update Attendence set AttendenceOfStudent='Present' where StudentID=?";
				PreparedStatement stat=conncetion.prepareStatement(sql);
				stat.setInt(1, attendance.getStudentID());
				int res=stat.executeUpdate();
				if(res>0)
					return "Attendance Is Updated";
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return "Attendance Is Not Updated";
		}
		public String InsertIntoAttendence(Attendence attendance) {
			try {
				Connection conncetion=dbConnection.getConnect();
				String sql="insert into Attendence values(?,?,?,?,?,?)";
				PreparedStatement stat=conncetion.prepareStatement(sql);
				stat.setString(1, attendance.getStudentName());
				stat.setInt(2, attendance.getStudentID());
				stat.setString(3, attendance.getSemester());
				stat.setString(4, attendance.getDepartment());
				stat.setString(5, attendance.getAttendenceOfStudent());
				stat.setDate(6, new java.sql.Date(attendance.getDateOfAttendence().getTime()));
				int res=stat.executeUpdate();
				if(res>0)
					return "Attendance is Mark";
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return "Attendance is Not Mark";
		}
		
		public ArrayList<Attendence> SearchResultBySemester(String Semester,Date DateOfAttendence){
			try {
				Connection connection=dbConnection.getConnect();
				String sql="select * from Attendence where Semester=? and DateOfAttendence=?";
				PreparedStatement stat=connection.prepareStatement(sql);
				stat.setString(1, Semester);
				stat.setDate(2, new java.sql.Date(DateOfAttendence.getTime()));
				ResultSet rs=stat.executeQuery();
				ArrayList<Attendence> attendList=new ArrayList<>();
				if(rs.next() == false) {
					return null;
				}
				else {
				do{
					String studentName=rs.getString(1);
					int studentId=rs.getInt(2);
					String attendance=rs.getString(5);
					Attendence attend=new Attendence(studentName,studentId, attendance);
					attendList.add(attend);
				}while(rs.next());
				}
				return attendList;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
	}
		