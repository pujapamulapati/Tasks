package SkillBasedAssement4.demo;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import SkillBasedAssement4.demo.RegisterUser.CreateUser;
import SkillBasedAssement4.demo.RegisterDao.RegisterDao;

@Controller
public class HomeController {
	@Autowired
	RegisterDao dao;
	
	@RequestMapping(value="/PortalPage")
	public String home(Model model)
	{
	return "PortalPage";
	}
	@RequestMapping(value="/SignUp")
	public String SignUp(Model model)
	{
	return "SignUp";
	}
	@RequestMapping(value="/display")
	public String display(Model model,@ModelAttribute CreateUser newuser)
	{
	String status=dao.CreateUser(newuser);
	model.addAttribute("status",status);
	return "display";
	}
	@RequestMapping(value = "/LoginPage")
	public String loginpage() {
		return "LoginPage";
	}
	
	@RequestMapping(value = "/loginValidation")
	public String loginValidation(Model model,@RequestParam("user_Name") String user_Name,@RequestParam("user_password") String user_password) {
		ArrayList<CreateUser> User=dao.validateLogin(user_Name);
		model.addAttribute("User", User);
		String password=User.get(0).getUser_password();
		System.out.println(password);
		  if(password.equals(user_password)) 
		  {
			  return "LoginSuccess"; 
		} 
		  else 
		  { 
			  return "LoginFailed"; 
		}		 
	}
    @RequestMapping(value="/ForgotPassword")
	public String forgotPassword() {
		System.out.println("Forgot password page displayed");
		return "ForgotPassword";
	}
	int user_ID=0;
	@RequestMapping(value = "/Validate")
	public String Validate(Model model,@RequestParam("user_ID") String user_ID,@RequestParam("user_SecurityQuestion") String user_SecurityQuestion,@RequestParam("user_SecurityAnswer") String user_SecurityAnswer) {
		int userId=Integer.parseInt(user_ID);
		this.user_ID=userId;
		CreateUser User=dao.getDetails(userId);
		String SecurityQuestion=User.getUser_SecurityQuestion();
		System.out.println(SecurityQuestion);
		String SecurityAnswer=User.getUser_SecurityAnswer();
		System.out.println(SecurityAnswer);
		if(SecurityQuestion.equals(user_SecurityQuestion) &&  SecurityAnswer.equals(user_SecurityAnswer))
				{
				return "ChangePassword";
		}
		return "ForgotPasswordInvalid";
	}
	@RequestMapping(value = "/ChangePassword")
	public String changePassword(Model model, @RequestParam("user_ID") String user_Id,@RequestParam("user_password") String user_password, @RequestParam("user_confirmPassword") String user_confirmPassword) {
		if(user_password.equals(user_confirmPassword)) {	
		String s=dao.updatePassword(user_ID, user_password);
			System.out.println(s);
			return "PasswordChangeSuccess";
	}
		return "PasswordChangeNotSuccess";
}
}