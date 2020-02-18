package com.capgemini.dd.dao;

import java.util.List;
import java.util.Set;

import com.capgemini.dd.entity.TrackOrderDetails;
import com.capgemini.dd.exceptions.NoDataFoundException;
import com.capgemini.dd.util.TrackOrderRepository;

public class InventoryTrackandUpdateDaoImpl implements InventoryTrackandUpdateDao {
	@Override
	public Set<Integer> getId() {
		
		return (Set<Integer>) TrackOrderRepository.trackMap.keySet();
	}

	
	@Override
	public TrackOrderDetails getTrackOrderDetailsDao(Integer id) throws Exception
	 {
		if(TrackOrderRepository.trackMap.containsKey(id)) {
			return TrackOrderRepository.trackMap.get(id);
		}
		else
			throw new NoDataFoundException("Order Id not Found");
	 }
	
	@Override
	public TrackOrderDetails  updateDeliveryStatusDao(TrackOrderDetails tod)
	{
		TrackOrderRepository.trackMap.put(tod.getOrderId(), tod);
		return TrackOrderRepository.trackMap.get(tod.getOrderId());
		
	}

	
	
	
	}

