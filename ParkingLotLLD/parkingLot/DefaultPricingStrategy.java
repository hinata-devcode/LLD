package parkingLot;

public class DefaultPricingStrategy implements PricingStrategy {

	@Override
	public int computeCost(Ticket ticket) {
		return ticket.getSpot().getPrice();
	}

}
