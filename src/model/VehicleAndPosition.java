package model;

public class VehicleAndPosition {
	
	private Vehicle vehicle;
	private int queueNumber;
	
	public Vehicle getVehicle(){
		
		
		return this.vehicle;
		
	}
	
	public int getQueueNumber(){
		
		
		return this.queueNumber;
	}
	
	
	
	
	
	
	public VehicleAndPosition(Vehicle vehicle,int queueNumber) {
		
		this.vehicle=vehicle;
		this.queueNumber=queueNumber;
		

	}


}
