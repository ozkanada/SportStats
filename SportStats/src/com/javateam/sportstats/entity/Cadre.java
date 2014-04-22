package com.javateam.sportstats.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="cadre")
public class Cadre {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cadreId;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,targetEntity=Match.class)
	@JoinColumn(name="match_id")
	private Match match;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,targetEntity=Player.class)
	@JoinColumn(name="player_id")
	private Player player;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,targetEntity=Team.class)
	@JoinColumn(name="team_id")
	private Team team;
	
	
	
	public Cadre() {
	}
	
	public Long getCadreId() {
		return cadreId;
	}
	public void setCadreId(Long cadreId) {
		this.cadreId = cadreId;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}

}
