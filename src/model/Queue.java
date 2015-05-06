package model;

import java.util.LinkedList;


/**
 * This is the class which manages the queue of cars,
 * it has an ordered lists of vehicle (knows which is first and last)
 * because it adds to the back of the queue and retrieves from the
 * front of the queue.
 * It also keeps track of the vehicle's queue number in order to implement this effectively .
 * @author David
 *
 */
public class Queue {
	
	public Queue(){
		
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	private Vehicle vehicle;
	
	
	/**
	 * LinkedList declaration so as to be able to add a 
	 * new vehicle to the queue or to get the next  in line
	 */
	int nextAvailableQueueNumber = 0;
	LinkedList<VehicleAndPosition> queue= new LinkedList<VehicleAndPosition>();
	
	
	public Queue(Vehicle vehicle){
		this.setVehicle(vehicle);
		} 
	
	
	
	public Vehicle getNextVehicle(WorkOrderItem item){
		
		
		return null;
	}
	
	
	public int addVehicle(Vehicle vehicle){
		
		
		return this.nextAvailableQueueNumber;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	}



