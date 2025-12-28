package parkingLot;

import java.util.List;

public abstract class ParkingSpotManager {

	protected List<ParkingSpot> parkingSpotList;
	protected ParkingSpotStrategy strategy;

	public ParkingSpotManager(List<ParkingSpot> parkingSpotList,ParkingSpotStrategy strategy) {
		this.parkingSpotList = parkingSpotList;
		this.strategy=strategy;
	}

	abstract ParkingSpot findParkingSpot(Vehicle vehicle);
	abstract void removeParkingSpot(ParkingSpot spot);

}
