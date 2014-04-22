package com.javateam.sportstats.repository;

import com.javateam.sportstats.core.BaseRepository;
import com.javateam.sportstats.entity.SportType;

public class SportTypeRepository extends BaseRepository<SportType>{

	public SportTypeRepository() {
		super(SportType.class);		
	}		
}
