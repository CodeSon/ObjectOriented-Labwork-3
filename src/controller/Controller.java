package controller;
import model.Vehicle;
import model.WorkOrder;
import model.Queue;
import model.Printer;
import model.Garage;
import model.WorkOrderItem;
import view.View;

/**
 * In the controller is where all interactions with the data is
 * carried out
 * @author David
 * Inspection queue contains a queue of different sets of 
 *  inspections
 *
 */

public class Controller {
	
	Garage g=new Garage(true, false);
	
	InspectionQueue inspectionQueue;
	WorkOrderItem workItem = new WorkOrderItem("Check engine", 1000.0);
	Vehicle car1 = new Vehicle("ABD 345","VAN","brandNew",2015);
	Vehicle car2 = new Vehicle("AAA 456","CONVERTIBLE","RUSTY",1999);
	
	Queue q = new Queue();

	public Controller( ){
		
		
		
		
	}
	
	public void makeNewInspection(){
		q.addVehicle(car1);
		q.addVehicle(car2);
		q.getNextVehicle(workItem);
	}
	
public boolean openDoor(){
	return true;
		
	}

public boolean closeDoor(){
	return true;
	
}

public String enterLicense(){
	return null;
	
}

public String checkInspection(){
	return null;
	
}

public String customerCreditCardInfo(){
	return null;
	
//final String costOfInspection(){
//	return null;
//	
//	
//		
//	}
//
//public String  makesPayment(){
//	
//	return 
//	
//}
	
}

}
