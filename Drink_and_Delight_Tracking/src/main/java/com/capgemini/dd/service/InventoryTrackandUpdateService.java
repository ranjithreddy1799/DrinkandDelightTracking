package com.capgemini.dd.service;

import com.capgemini.dd.entity.TrackOrderDetails;

public interface InventoryTrackandUpdateService {
	
	
	public TrackOrderDetails getTrackOrderDetailsService(Integer id) throws Exception;
	public TrackOrderDetails updateDeliveryStatusService(int id,String place) throws Exception;
	

}
