package parkingLot;

public abstract class ParkingSpot {

	protected final int id;
	protected Vehicle vh;

	protected int price;
	protected boolean isEmpty = true;

	public ParkingSpot(int id, int price) {
		this.id = id;
		this.price = price;
	}

	public void parkVehicle(Vehicle vh) {
		if (!isEmpty)
			throw new IllegalStateException();

		if (!canFitVehicle(vh))
			throw new IllegalStateException();

		this.vh = vh;
		this.isEmpty = false;

	}

	public final void removeVehicle() {
		if (isEmpty)
			throw new IllegalStateException("Spot already empty");

		this.vh = null;
		this.isEmpty = true;
	}

	abstract boolean canFitVehicle(Vehicle vehicle);

	public int getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

}
