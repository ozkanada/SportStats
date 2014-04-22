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

@Entity @Table(name="season")
public class Season implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long seasonId;
	private String seasonName;
		
	@OneToMany(fetch=FetchType.LAZY,mappedBy="season") 
	private List<League> leaguies= new ArrayList<League>();	
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="season") 
	private List<Stand> stands= new ArrayList<Stand>();	
	
	
	public Season(Long seasonId, String seasonName) {	
		this.seasonId = seasonId;
		this.seasonName = seasonName; 
	}
	
	public Season() {		
	}
	
	public Long getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(Long seasonId) {
		this.seasonId = seasonId;
	}
	public String getSeasonName() {
		return seasonName;
	}
	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public List<League> getLeaguies() {
		return leaguies;
	}

	public void setLeaguies(List<League> leaguies) {
		this.leaguies = leaguies;
	}

	public List<Stand> getStands() {
		return stands;
	}

	public void setStands(List<Stand> stands) {
		this.stands = stands;
	}	
}
