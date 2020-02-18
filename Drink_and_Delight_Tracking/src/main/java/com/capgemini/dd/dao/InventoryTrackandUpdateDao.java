package com.capgemini.dd.dao;

import java.util.List;
import java.util.Set;

import com.capgemini.dd.entity.TrackOrderDetails;

public interface InventoryTrackandUpdateDao {

	public Set<Integer> getId();

	public TrackOrderDetails getTrackOrderDetailsDao(Integer id) throws Exception;

	public TrackOrderDetails updateDeliveryStatusDao(TrackOrderDetails tod);
}
