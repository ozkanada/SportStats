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

@Entity @Table(name="country")
public class Country  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long countryId;
	private String countryName; 
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="country")
	private List<League> leaguies = new ArrayList<League>();
		
	public Country(Long countryId, String countryName, List<League> leaguies) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.leaguies = leaguies;
	}

	public Country() { 
	}

	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public List<League> getLeaguies() {
		return leaguies;
	}

	public void setLeagueList(List<League> leaguies) {
		this.leaguies = leaguies;
	}
	
	
	
}
