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

@Entity @Table(name="league")
public class League implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long leagueId;	
	private String leagueName;	
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST,targetEntity=Country.class)
	@JoinColumn(name="country_id",nullable=false)
	private Country country;
	 
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST,targetEntity=Season.class)
	@JoinColumn(name="season_id",nullable=false)
	private Season season;	
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="league")
	private List<Match> matchs = new ArrayList<Match>();
	
	@ManyToOne(fetch=FetchType.EAGER,targetEntity=SportType.class)
	@JoinColumn(name="sport_type_id",nullable=false)
	private SportType sportType;
	
	public League() { 
	}

	public Long getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Long leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public List<Match> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}

	public SportType getSportType() {
		return sportType;
	}

	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}
	
	
}
