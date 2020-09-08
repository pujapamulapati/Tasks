package com.mypackage.playerdata.playerdao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.mypackage.playerdata.player.Player;


@Transactional
public class PlayerDao {
	@Autowired
	SessionFactory factory;

	public PlayerDao() {
		// TODO Auto-generated constructor stub
	}

	public PlayerDao(SessionFactory factory) {
	super();
	this.factory = factory;
	}

	public String savePlayer(Player player){
	try{
	Session session=factory.getCurrentSession();
	session.save(player);
	return "Player Details Created";
	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	return "Cannot Create Player Details";
	}
	
	public Player getPlayerById(int playerId){
		try{
		Session session=factory.getCurrentSession();
		Player player=(Player)session.get(Player.class,playerId);
		return player;
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		return null;
		}
	
		public String updatePlayerById(Player player){
		try{
		Session session=factory.getCurrentSession();
		System.out.println("Player "+player);
		session.update("Player", player);
		return "Player Updated";
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		return "Cannot Update Player";
}
		
		public ArrayList<Player> getByplayerCountry(String playerCountry){
			
			Session session=factory.openSession();
			Criteria ct=session.createCriteria(Player.class);
			ct.add(Restrictions.ilike("playerCountry", playerCountry));
			ArrayList<Player> player=(ArrayList<Player>) ct.list();
			System.out.println(player);
			return player;
		}


		public ArrayList<Player> getByplayerName(String playerName){
			
			Session session=factory.openSession();
			
			Criteria ct=session.createCriteria(Player.class);
			ct.add(Restrictions.ilike("playerName", playerName));
			ArrayList<Player> player=(ArrayList<Player>) ct.list();
			System.out.println(player);
			return player;
		}

		public String deletePlayer(String playerName){
		try{
		Session session=factory.getCurrentSession();
		Query query=session.createQuery("delete from Player a  where a.playerName=:playername");
		query.setParameter("playername", playerName);
		int count=query.executeUpdate();
		if(count>0)
			return "Data deleted";
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}

		return "Cannot Delete Data";
		}


}
