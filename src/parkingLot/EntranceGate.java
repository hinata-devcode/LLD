package parkingLot;

import java.time.Instant;

public class EntranceGate {

	private Vehicle vehicle;
	private ParkingSpotManager manager;
	private ParkingSpotManagerFactory factory;
	private Ticket ticket;

	public EntranceGate(Vehicle vehicle, ParkingSpotManagerFactory factory) {
		super();
		this.vehicle = vehicle;
		this.factory = factory;
	}

	public void bookParkinglot() {
		manager = factory.createManager(vehicle.getType());
		var spot = manager.findParkingSpot(new ParkingSpotStrategy(), vehicle);

		if (spot != null)
			ticket = createTicket(vehicle, spot);

	}

	private Ticket createTicket(Vehicle vehicle, ParkingSpot spot) {
		return new Ticket(Instant.now().getEpochSecond(), vehicle, spot);
	}

}
