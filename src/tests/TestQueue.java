package tests;

import static org.junit.Assert.*;
import model.Queue;
import model.Vehicle;
import model.WorkOrderItem;

import org.junit.Before;
import org.junit.Test;

public class TestQueue {
	private Vehicle vehicle;
	private Vehicle specialVehicle;
	
	@Before
	public void setUp() throws Exception {
		this.vehicle = new Vehicle("ABC 123", "Car", "Ugly", 2008);
		this.specialVehicle = new Vehicle("XYZ 987", "Van", "Nice", 2015);
	}

	@Test
	public void testAddVehicle() {
		Queue q = new Queue();
		int qNo = 1233445;
		
		qNo = q.addVehicle(vehicle);
		
		assertEquals("First Queue Number doesn't match", 0, qNo);
		
		qNo = q.addVehicle(vehicle);
		
		assertEquals("Second Queue Number doesn't match", 1, qNo);
		
		qNo = q.addVehicle(vehicle);
		
		assertEquals("Third Queue Number doesn't match", 2, qNo);
	}
	
	
	@Test
	public void testGetNextVehicle() {
		WorkOrderItem work = new WorkOrderItem("Check engine", 1000.0);
		Queue q = new Queue();
		
		q.addVehicle(specialVehicle);
		q.addVehicle(vehicle);
		q.addVehicle(vehicle);
		
		assertEquals("Special Vehicles don't match", specialVehicle, q.getNextVehicle(work));
		assertEquals("Vehicles don't match", vehicle, q.getNextVehicle(work));
	}

}
