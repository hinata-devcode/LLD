package parkingLot;

public class CostComputation {
	
	private PricingStrategy strategy;
	
	public CostComputation(PricingStrategy strategy) {
		this.strategy = strategy;
	}

	public int computeCost(Ticket ticket) {
		return strategy.computeCost(ticket);
	}

}
