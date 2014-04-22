package com.javateam.sportstats.entity;

import java.io.Serializable;
import java.util.ArrayList;
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


@Entity @Table(name="player")
public class Player implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long playerId;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,targetEntity=Team.class)
	@JoinColumn(name="team_id",nullable=false)
	private Team team;
	
	private String name;
	private String lastName;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="player")
	private List<Position> position = new ArrayList<Position>();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="player")
	private List<Image> image = new ArrayList<Image>();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="player")
	private List<Cadre> cadres=new ArrayList<Cadre>();
	
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Position> getPosition() {
		return position;
	}
	public void setPosition(List<Position> position) {
		this.position = position;
	}
	public List<Image> getImage() {
		return image;
	}
	public void setImage(List<Image> image) {
		this.image = image;
	}
	public List<Cadre> getCadre() {
		return cadres;
	}
	public void setCadre(List<Cadre> cadre) {
		this.cadres = cadre;
	}
		
}
