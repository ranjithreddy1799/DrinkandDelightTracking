package com.capgemini.lpu.DandDTesting;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.capgemini.dd.exceptions.NoDataFoundException;
import com.capgemini.dd.service.InventoryTrackandUpdateService;
import com.capgemini.dd.service.TrackandUpdateService;

public class DandDTest {
	private static InventoryTrackandUpdateService obj;
	@BeforeAll
	public static void beforeall(){
		obj=new TrackandUpdateService();
	}
	
	@Test
	@DisplayName("Test for invalid orderId")
	public void DandDTest1() {
		
		assertThrows(NoDataFoundException.class,()->obj.getTrackOrderDetailsService(9));
		
	}
	
	
	
	

}
