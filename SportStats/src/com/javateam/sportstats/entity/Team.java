package com.javateam.sportstats.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;    
import javax.persistence.OneToMany; 
import javax.persistence.Table;

@Entity @Table(name="team")
public class Team implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long teamId;
	private String teamName;
		
	@OneToMany(fetch=FetchType.LAZY,mappedBy="homeTeam")
	private List<Match> homeMatch = new ArrayList<Match>();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="awayTeam")
	private List<Match> awayMatch= new ArrayList<Match>();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="team")
	private List<Player> players=new ArrayList<Player>();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="team")
	private List<Cadre> cadres=new ArrayList<Cadre>();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="team") 
	private List<Stand> stands= new ArrayList<Stand>();	
		
	public Team() {
	}
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<Match> getHomeMatch() {
		return homeMatch;
	}
	public void setHomeMatch(List<Match> homeMatch) {
		this.homeMatch = homeMatch;
	}
	public List<Match> getAwayMatch() {
		return awayMatch;
	}
	public void setAwayMatch(List<Match> awayMatch) {
		this.awayMatch = awayMatch;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public List<Cadre> getCadres() {
		return cadres;
	}
	public void setCadres(List<Cadre> cadres) {
		this.cadres = cadres;
	}
	public List<Stand> getStands() {
		return stands;
	}
	public void setStands(List<Stand> stands) {
		this.stands = stands;
	}	
}
