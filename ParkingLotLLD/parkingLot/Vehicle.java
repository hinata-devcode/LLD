package parkingLot;

public class Vehicle {

	int vehicleNumber;
	private VehicleType type;

	public Vehicle(int vehicleNumber, VehicleType type) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.type = type;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

}
