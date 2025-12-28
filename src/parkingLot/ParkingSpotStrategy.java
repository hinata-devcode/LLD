package parkingLot;

import java.util.List;

public class ParkingSpotStrategy {
	
	ParkingSpot findSlot(List<ParkingSpot> spots) {
		for(var spot:spots) {
			if(spot.isEmpty()) return spot;
		}
		return null;
	}
	
}
