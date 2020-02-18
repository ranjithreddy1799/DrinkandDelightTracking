package com.capgemini.dd.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.dd.entity.TrackOrderDetails;

public class TrackOrderRepository {
	public static Map<Integer, TrackOrderDetails> trackMap = new HashMap<Integer, TrackOrderDetails>();

	static {
		TrackOrderDetails td1 = new TrackOrderDetails(1, "sai suppliers", "banglore", LocalDate.of(2020, 02, 02));
		TrackOrderDetails td2 = new TrackOrderDetails(2, "Jai suppliers", "Hyderabad", LocalDate.of(2020, 02, 02));
		TrackOrderDetails td3 = new TrackOrderDetails(3, "Eswari suppliers", "Visakhapatnam",LocalDate.of(2020, 02, 02));
		TrackOrderDetails td4 = new TrackOrderDetails(4, "laxmi suppliers", "mumbai", LocalDate.of(2020, 02, 02));
		TrackOrderDetails td5 = new TrackOrderDetails(5, "sridhar suppliers", "delhi", LocalDate.of(2020, 02, 02));
		TrackOrderDetails td6 = new TrackOrderDetails(6, "kiran supplers", "punee", LocalDate.of(2020, 02, 02));
		TrackOrderDetails td7 = new TrackOrderDetails(7, "pavan supplers", "banglore", LocalDate.of(2020, 02, 02));
		trackMap.put(td1.getOrderId(), td1);
		trackMap.put(td2.getOrderId(), td2);
		trackMap.put(td3.getOrderId(), td3);
		trackMap.put(td4.getOrderId(), td4);
		trackMap.put(td5.getOrderId(), td5);
		trackMap.put(td6.getOrderId(), td6);
		trackMap.put(td7.getOrderId(), td7);
	}

}