package SkillBasedAssement4.demo.RegisterDao;


import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import SkillBasedAssement4.demo.RegisterUser.CreateUser;


@Component
@Transactional
public class RegisterDao {
	@Autowired
	SessionFactory factory;
	
	public RegisterDao() {
		// TODO Auto-generated constructor stub
	}
	public RegisterDao(SessionFactory factory) {
	super();
	this.factory = factory;
	}
	
	
	public String  CreateUser(CreateUser newUser){
	try{
	Session session=factory.getCurrentSession();
	session.save(newUser);
	return "Successfully Created Account In Our Portal";
	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	return "Cannot Create Account In Our Portal Beacause Data Already Used";
	}
	
	public ArrayList<CreateUser> validateLogin(String user_Name){
		try {
			Session session=factory.getCurrentSession();
			Criteria ct=session.createCriteria(CreateUser.class);
			ct.add(Restrictions.like("user_Name", user_Name));
			@SuppressWarnings("unchecked")
			ArrayList<CreateUser> user=(ArrayList<CreateUser>)ct.list();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public CreateUser getDetails(int user_ID) {
		try {
			Session session=factory.getCurrentSession();
			CreateUser User=session.get(CreateUser.class,user_ID);
			return User;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String updatePassword(int user_ID, String user_password) {
		try {
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("update CreateUser set user_password=:user_password where user_ID=:user_ID");
			query.setParameter("user_ID", user_ID);
			query.setParameter("user_password", user_password);
			int res=query.executeUpdate();
			if(res>0)
				return "Updated";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cannot update";
	}

}