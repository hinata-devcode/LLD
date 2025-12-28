package parkingLot;

public class TwoWheelerParkingSpot extends ParkingSpot {

	public TwoWheelerParkingSpot(int id, int price) {
		super(id, price);
	}

	@Override
	boolean canFitVehicle(Vehicle vh) {

		return vh.getType() == VehicleType.FourWheeler;
	}

}
