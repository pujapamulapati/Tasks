package com.mypackage.playerdata.player;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	int playerId;
	String playerName;
	String playerCountry;
	String playerGame;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerCountry() {
		return playerCountry;
	}
	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}
	public String getPlayerGame() {
		return playerGame;
	}
	public void setPlayerGame(String playerGame) {
		this.playerGame = playerGame;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerCountry=" + playerCountry
				+ ", playerGame=" + playerGame + "]";
	}
	public Player(int playerId, String playerName, String playerCountry, String playerGame) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerCountry = playerCountry;
		this.playerGame = playerGame;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
}
	
