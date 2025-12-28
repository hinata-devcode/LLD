package parkingLot;

public class FourWheelerParkingSpot extends ParkingSpot{

	public FourWheelerParkingSpot(int id, int price) {
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
