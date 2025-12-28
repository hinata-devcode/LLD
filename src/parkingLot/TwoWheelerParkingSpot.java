package parkingLot;

public class TwoWheelerParkingSpot extends ParkingSpot{

	public TwoWheelerParkingSpot(int id, int price) {
		super(id, price);
	}

	@Override
	void parkVehicle(Vehicle vh) {
		super.setVh(vh);
		super.setEmpty(false);
	}

	@Override
	void removeVehicle() {
		super.setVh(null);
		super.setEmpty(true);
	}
	
	
}
