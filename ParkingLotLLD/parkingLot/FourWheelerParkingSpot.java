package parkingLot;

public class FourWheelerParkingSpot extends ParkingSpot {

	public FourWheelerParkingSpot(int id, int price) {
		super(id, price);
	}

	@Override
	boolean canFitVehicle(Vehicle vh) {

		return vh.getType() == VehicleType.FourWheeler;
	}

}
