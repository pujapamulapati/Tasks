package SkillBasedAssement4.demo.RegisterUser;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreateUser {
	@Id
	int user_ID;
	String user_FullName;
	String user_Name;
	String user_password;
	String user_SecurityQuestion;
	String user_SecurityAnswer;
	public String getUser_FullName() {
		return user_FullName;
	}
	public void setUser_FullName(String user_FullName) {
		this.user_FullName = user_FullName;
	}
	public int getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_SecurityQuestion() {
		return user_SecurityQuestion;
	}
	public void setUser_SecurityQuestion(String user_SecurityQuestion) {
		this.user_SecurityQuestion = user_SecurityQuestion;
	}
	public String getUser_SecurityAnswer() {
		return user_SecurityAnswer;
	}
	public void setUser_SecurityAnswer(String user_SecurityAnswer) {
		this.user_SecurityAnswer = user_SecurityAnswer;
	}
	public CreateUser(String user_FullName, int user_ID, String user_Name, String user_password,
			String user_SecurityQuestion, String user_SecurityAnswer) {
		super();
		this.user_FullName = user_FullName;
		this.user_ID = user_ID;
		this.user_Name = user_Name;
		this.user_password = user_password;
		this.user_SecurityQuestion = user_SecurityQuestion;
		this.user_SecurityAnswer = user_SecurityAnswer;
	}
	@Override
	public String toString() {
		return "CreateUser [user_FullName=" + user_FullName + ", user_ID=" + user_ID + ", user_Name=" + user_Name
				+ ", user_password=" + user_password + ", user_SecurityQuestion=" + user_SecurityQuestion
				+ ", user_SecurityAnswer=" + user_SecurityAnswer + "]";
	}
	public CreateUser() {
		// TODO Auto-generated constructor stub
	}
}
