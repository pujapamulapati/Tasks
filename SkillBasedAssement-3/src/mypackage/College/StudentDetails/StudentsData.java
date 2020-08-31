package mypackage.College.StudentDetails;

public class StudentsData  {
	private String StudentName;
	private int StudentID;
	private String Semester;
	private String Department;
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
	
	public StudentsData(String studentName, int studentID, String semester, String department) {
		super();
		StudentName = studentName;
		StudentID = studentID;
		Semester = semester;
		Department = department;
	}
	@Override
	public String toString() {
		return "StudentsData [StudentName=" + StudentName + ", StudentID=" + StudentID + ", Semester=" + Semester
				+ ", Department=" + Department + "]";
	}
	public StudentsData(){
		
	}
	
	
}