package com.onchange.inventory.reporsitory;

import org.springframework.data.repository.CrudRepository;

import com.onchange.inventory.dto.SiteDto;

public interface  SiteDao  extends CrudRepository<SiteDto, Long>{
	
	
}