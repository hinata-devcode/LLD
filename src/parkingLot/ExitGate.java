package parkingLot;

public class ExitGate {

	private Ticket ticket;
	private CostComputation cost;
	private ParkingSpotManager manager;

	public ExitGate(Ticket ticket) {
		this.ticket = ticket;
	}

	public int findCost() {
	    manager.removeParkingSpot(ticket.getSpot());
		return cost.computeCost(ticket);
	}

}
