package com.javateam.sportstats.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name="matchs")
public class Match implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long matchId;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST,targetEntity=League.class)
	@JoinColumn(name="league_id",nullable=false)
	private League league;	 
	
	private Date matchDate; 
	private String matchTime;
 	
	private int halfTime;
	private int fulltime;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST,targetEntity=Team.class)
	@JoinColumn(name="home_team_id",nullable=false)
	private Team homeTeam;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST,targetEntity=Team.class)
	@JoinColumn(name="away_team_id",nullable=false)	
	private Team awayTeam;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="match")
	private List<Cadre> cadres=new ArrayList<Cadre>();
	
	public Long getMatchId() {
		return matchId;
	}
	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	} 
	
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public String getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	} 
	public int getHalfTime() {
		return halfTime;
	}
	public void setHalfTime(int halfTime) {
		this.halfTime = halfTime;
	}
	public int getFulltime() {
		return fulltime;
	}
	public void setFulltime(int fulltime) {
		this.fulltime = fulltime;
	}
	 
	public Team getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public Team getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	public List<Cadre> getCadres() {
		return cadres;
	}
	public void setCadres(List<Cadre> cadres) {
		this.cadres = cadres;
	}
		
}
