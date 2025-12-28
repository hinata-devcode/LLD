package parkingLot;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {

	List<ParkingSpot> twoWheelerList;
	SlotDao slotDao;

	public TwoWheelerParkingSpotManager(List<ParkingSpot> list) {
		super(list); // creating list in factory pattern
		this.twoWheelerList = list;
	}

	@Override
	ParkingSpot findParkingSpot(ParkingSpotStrategy strategy,Vehicle vehicle) {
		var spot = strategy.findSlot(twoWheelerList);
		if(spot!=null) {
		spot.parkVehicle(vehicle);
		return spot;
		}
		else
			return null;
	}

	@Override
	void removeParkingSpot(ParkingSpot spot) {
	   spot.removeVehicle();	
	}

}
