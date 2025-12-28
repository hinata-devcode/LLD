package parkingLot;

import java.util.List;

public abstract class ParkingSpotManager {

	protected List<ParkingSpot> parkingSpotList;
	//private ParkingSpotStrategy strategy;

	public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
		this.parkingSpotList = parkingSpotList;
	}

	abstract ParkingSpot findParkingSpot(ParkingSpotStrategy strategy,Vehicle vehicle);
	abstract void removeParkingSpot(ParkingSpot spot);

}
