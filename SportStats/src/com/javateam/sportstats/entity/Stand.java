package com.javateam.sportstats.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="stand")
public class Stand implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long standId;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,targetEntity=Season.class)
	@JoinColumn(name="season_id")
	private Season season;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,targetEntity=Team.class)
	@JoinColumn(name="team_id")
	private Team team;
	
	private int matchesPlayed;
	private int wins;
	private int draws;
	private int Losses;
	private int goals;
	private int points;
	
	
	public Stand(Season season, Team team, int matchesPlayed,
	             int wins, int draws, int losses, int goals, int points) {
		super();
		this.standId = standId;
		this.season = season;
		this.team = team;
		this.matchesPlayed = matchesPlayed;
		this.wins = wins;
		this.draws = draws;
		Losses = losses;
		this.goals = goals;
		this.points = points;
	}
	
	
	public Stand() {
	}


	public Long getStandId() {
		return standId;
	}
	public void setStandId(Long standId) {
		this.standId = standId;
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public int getLosses() {
		return Losses;
	}
	public void setLosses(int losses) {
		Losses = losses;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}
