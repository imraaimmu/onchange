package com.onchange.inventory.reporsitory;

import org.springframework.data.repository.CrudRepository;

import com.onchange.inventory.dto.VendorPoLinkDto;

public interface  VendorPoLinkDao  extends CrudRepository<VendorPoLinkDto, Long>{
	
	
}