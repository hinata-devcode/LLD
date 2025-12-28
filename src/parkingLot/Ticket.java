package parkingLot;

public class Ticket {

	private long ticketNumber;
	private Vehicle vehicle;
	private ParkingSpot spot;

	public Ticket(long ticketNumber, Vehicle vehicle, ParkingSpot spot) {
		super();
		this.ticketNumber = ticketNumber;
		this.vehicle = vehicle;
		this.spot = spot;
	}

	public ParkingSpot getSpot() {
		return spot;
	}

	public void setSpot(ParkingSpot spot) {
		this.spot = spot;
	}
	
	

}
