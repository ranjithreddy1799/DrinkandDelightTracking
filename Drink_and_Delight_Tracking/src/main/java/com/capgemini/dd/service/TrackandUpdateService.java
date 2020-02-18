package com.capgemini.dd.service;

import java.util.List;
import java.util.Set;

import com.capgemini.dd.dao.InventoryTrackandUpdateDao;
import com.capgemini.dd.dao.InventoryTrackandUpdateDaoImpl;
import com.capgemini.dd.entity.TrackOrderDetails;
import com.capgemini.dd.exceptions.NoDataFoundException;

public class TrackandUpdateService implements InventoryTrackandUpdateService {

	
	 InventoryTrackandUpdateDao obj=new InventoryTrackandUpdateDaoImpl();
	 
	 public Set<Integer> getId()
	 {  
		Set<Integer> lst1=obj.getId();
		return lst1;
	 }

	@Override
	public TrackOrderDetails getTrackOrderDetailsService(Integer id) throws Exception {
		Set<Integer> lst=getId();
		if(lst.contains(id))
			return obj.getTrackOrderDetailsDao(id);
		else
			throw new NoDataFoundException("Order Id not Found");
	}

	@Override
	public TrackOrderDetails updateDeliveryStatusService(int id, String place) throws Exception {
		//validations
		TrackOrderDetails todd=null;
		Set<Integer> lst=getId();
		if(lst.contains(id)) {
			todd=obj.getTrackOrderDetailsDao(id);
			todd.setPlace(place);
			
			return obj.updateDeliveryStatusDao(todd);
		}
		else
			throw new NoDataFoundException("Order Id not Found");
	}

}

