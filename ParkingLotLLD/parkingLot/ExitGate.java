package parkingLot;

public class ExitGate {

	private Ticket ticket;
	private CostComputation cost;
	private ParkingSpotManager manager;

	public ExitGate(Ticket ticket, CostComputation computation) {
		this.ticket = ticket;
		this.cost = computation;
	}

	public int findCost() {

		int finalPrice = cost.computeCost(ticket);
		manager.removeParkingSpot(ticket.getSpot());
		return finalPrice;
	}

}
