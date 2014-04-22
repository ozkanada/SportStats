package com.javateam.sportstats.faces;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.javateam.sportstats.core.FaceUtilities;
import com.javateam.sportstats.entity.SportType;
import com.javateam.sportstats.repository.SportTypeRepository;

@ManagedBean
@RequestScoped
public class SportTypeSummaryBean {
	private List<SportType> sportTypes;

	public SportTypeSummaryBean() {
		sportTypes=new ArrayList<SportType>();
		SportTypeRepository repository=new SportTypeRepository();
		sportTypes=repository.List();
		repository.close();		
	}
	
	public String remove(){
		if(FaceUtilities.getRequestId("sportTypeId")!=-1L){
			SportTypeRepository repository=new SportTypeRepository();		
			repository.remove(FaceUtilities.getRequestId("sportTypeId"));
			sportTypes=repository.List();
			repository.close();  
		}				
		return "SportTypeSummaryPage";
	}

	public List<SportType> getSportTypes() {
		return sportTypes;
	}

	public void setSportTypes(List<SportType> sportTypes) {
		this.sportTypes = sportTypes;
	}
	
	public String yeni(){
		return "SportTypeDetailPage";
	}
	
}
