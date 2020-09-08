package com.mypackage.playerdata;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mypackage.playerdata.player.Player;
import com.mypackage.playerdata.playerdao.PlayerDao;


@Controller
public class HomeController {
	@Autowired
	PlayerDao dao;

	@RequestMapping(value="/")
	public String home(Model model)
	{
	return "home";
	}
	@RequestMapping(value="/SaveDetails")
	public String SaveDetails(Model model)
	{
	return "SaveDetails";
	}

	@RequestMapping(value="/display")
	public String display(Model model,@ModelAttribute Player player)
	{
	String status=dao.savePlayer(player);
	model.addAttribute("status",status);
	return "display";
	}
	
	@RequestMapping(value="/updatePage")
	public String update()
	{
	return "updatePage";
	}

	int playerId=0;

	@RequestMapping(value="/searchForUpdate")
	public String searchForUpdate(Model model,@RequestParam("playerId") String playerId)
	{
	int playerID=Integer.parseInt(playerId);
	this.playerId=playerID;
	Player player=dao.getPlayerById(playerID);
	model.addAttribute(player);
	return "updatePage";
	}

	@RequestMapping(value="/updateData")
	public String updateData(Model model ,@ModelAttribute Player player)
	{
	player.setPlayerId(playerId);
	dao.updatePlayerById(player);
	String status=dao.updatePlayerById(player);
	model.addAttribute("status",status);
	return "display";
	}
	
	@RequestMapping(value="/SearchDetailsByCountry")
	public String SearchDetailsByCountry(Model model)
	{
	return "SearchDetailsByCountry";
	}
	@RequestMapping(value="/playersByCountry")
	public String playersByCountry(Model model,@RequestParam("playerCountry") String playerCountry)
	{
	ArrayList<Player> player=dao.getByplayerCountry(playerCountry);
	model.addAttribute("player",player);
	return "displayByPlayerCountry";
	}
	
	@RequestMapping(value="/SearchDetailsByName")
	public String SearchDetailsByName(Model model)
	{
	return "SearchDetailsByName";
	}
	@RequestMapping(value="/playersByName")
	public String authorsByName(Model model,@RequestParam("playerName") String playerName)
	{
	ArrayList<Player> player=dao.getByplayerName(playerName);
	model.addAttribute("player",player);
	return "displayByPlayerName";
	}
    
	@RequestMapping(value="/DeleteDetailsByName")
	public String DeleteDetailsByName(Model model)
	{
	return "DeleteDetailsByName";
	}
	@RequestMapping(value="/deleteByName")
	public String deleteByName(Model model,@RequestParam("playerName") String playerName)
	{
	String status=dao.deletePlayer(playerName);
	model.addAttribute("status",status);
	return "display";
	}

}
