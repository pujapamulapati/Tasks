package mypackage.College.StudentInsert;

import java.sql.Connection;
import java.sql.PreparedStatement;

import mypackage.College.DBConnt.dbConnection;
import mypackage.College.StudentDetails.StudentsData;


public class StudentInsertion{

public String createNewStudent(StudentsData student){
try 
{
Connection connection=dbConnection.getConnect();
String sql="insert into StudentsData values(?,?,?,?)";
PreparedStatement stat=connection.prepareStatement(sql);

stat.setString(1, student.getStudentName());
stat.setInt(2, student.getStudentID());
stat.setString(3, student.getSemester());
stat.setString(4, student.getDepartment());
int res= stat.executeUpdate();
if(res>0)
return "Student Details  Created";
else
return "Student Details Cannot be Created";
}
catch (Exception e) {
e.printStackTrace();
return "Exception "+e;
}


}

}

