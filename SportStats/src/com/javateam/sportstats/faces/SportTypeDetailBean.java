package com.javateam.sportstats.faces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.javateam.sportstats.core.FaceUtilities;
import com.javateam.sportstats.entity.SportType;
import com.javateam.sportstats.repository.SportTypeRepository;

@ManagedBean
@RequestScoped
public class SportTypeDetailBean {
	private SportType sportType;

	public SportTypeDetailBean() {
		if(FaceUtilities.getRequestId("sportTypeId")==-1L){
			sportType=new SportType();  
		}else{
			SportTypeRepository repository=new SportTypeRepository();		
			sportType=repository.find(FaceUtilities.getRequestId("sportTypeId"));
			repository.close();
		}
	}
	
	public String kaydet(){
		if(FaceUtilities.getRequestId("sportTypeId")==-1L){
			SportTypeRepository repository=new SportTypeRepository();		
			repository.persist(sportType);		
			repository.close();  
		}else{
			SportTypeRepository repository=new SportTypeRepository();		
			repository.merge(sportType);
			repository.close();
		}				
		return "SportTypeSummaryPage";
	}
	
	public SportType getSportType() {
		return sportType;
	}

	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}		
}
