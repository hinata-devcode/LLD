package parkingLot;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {

	public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
		super(parkingSpotList);
	}

	@Override
	ParkingSpot findParkingSpot(ParkingSpotStrategy strategy, Vehicle vehicle) {
		var spot = strategy.findSlot(parkingSpotList);
		if (spot != null) {
			spot.parkVehicle(vehicle);
			return spot;
		} else
			return null;
	}

	@Override
	void removeParkingSpot(ParkingSpot spot) {
		spot.removeVehicle();
	}

}
