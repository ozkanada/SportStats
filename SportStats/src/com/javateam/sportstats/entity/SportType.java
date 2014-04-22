package com.javateam.sportstats.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="sporttype")
public class SportType {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long typeId;
	private String typeName;
		
	public SportType(Long typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}
	public SportType() {
	}
	
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}	
}
