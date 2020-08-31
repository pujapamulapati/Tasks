package mypackage.College.Attendence;

import java.util.Date;

public class Attendence  {
	private String StudentName;
	private int StudentID;
	private String Semester;
	private String Department;
	private String AttendenceOfStudent;
	private Date DateOfAttendence;

	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getAttendenceOfStudent() {
		return AttendenceOfStudent;
	}
	public void setAttendenceOfStudent(String attendenceOfStudent) {
		AttendenceOfStudent = attendenceOfStudent;
	}
	public  Date getDateOfAttendence() {
		return DateOfAttendence;
	}
	public void setDateOfAttendence(Date dateOfAttendence) {
		DateOfAttendence = dateOfAttendence;
	}
	
	public Attendence(String studentName, int studentID, String semester, String department, String attendenceOfStudent,
			Date dateOfAttendence) {
		StudentName = studentName;
		StudentID = studentID;
		Semester = semester;
		Department = department;
		AttendenceOfStudent = attendenceOfStudent;
		DateOfAttendence = dateOfAttendence;
	}
	@Override
	public String toString() {
		return "Attendence [StudentName=" + StudentName + ", StudentID=" + StudentID + ", Semester=" + Semester
				+ ", Department=" + Department + ", AttendenceOfStudent=" + AttendenceOfStudent + ", DateOfAttendence="
				+ DateOfAttendence + "]";
	}
	
	public Attendence(int studentId2) {
	}
	public Attendence(String studentName2, int studentId2, String attendance) {
		// TODO Auto-generated constructor stub
	}
	
}
	