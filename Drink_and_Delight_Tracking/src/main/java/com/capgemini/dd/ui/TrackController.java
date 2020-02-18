package com.capgemini.dd.ui;
import java.util.Scanner;

import com.capgemini.dd.entity.TrackOrderDetails;
import com.capgemini.dd.service.TrackandUpdateService;
import com.capgemini.dd.util.TrackOrderRepository;
public class TrackController {
	
	public static void main(String args[]) throws Exception
	{
	 TrackOrderRepository obj1=new TrackOrderRepository();
	 TrackOrderDetails obj2;
	 TrackandUpdateService obj=new TrackandUpdateService();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Before updating ,,,,delivery status for user");
	 System.out.println("--------------------------------------------");
	 System.out.println("ur order ids are \n"+obj.getId());
	 System.out.println("enter order id from ur list");
	 int id=sc.nextInt();
	 
	 System.out.println( obj.getTrackOrderDetailsService(id));
	 
	 
     System.out.println("*************************************************************************************************************************************");
	 
	 System.out.println("employee updating the delivery status");
	 System.out.println("-------------------------------------");
	 TrackandUpdateService obj3=new TrackandUpdateService();
	 System.out.println("order ids for the employee are \n"+obj3.getId());
	 System.out.println("enter the id u want to update");
	 int orderId=sc.nextInt();
	 obj2 = TrackOrderRepository.trackMap.get(orderId);
	 System.out.println("enter the updated place");
	 String orderPlace=sc.next();
	System.out.println(obj3.updateDeliveryStatusService(orderId, orderPlace));
	System.out.println(obj2.getDate());
	 
	 System.out.println("*************************************************************************************************************************************");
	 
	
	 System.out.println("After updating by employee, delivery staus for user");
	 System.out.println("---------------------------------------------------");
	 System.out.println("your order ids \n"+obj.getId());
	 System.out.println("enter the order id u want to track");
	 int idd=sc.nextInt();
	 System.out.println( obj.getTrackOrderDetailsService(idd));

		sc.close();
	}

}
