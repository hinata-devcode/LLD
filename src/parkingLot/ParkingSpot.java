package parkingLot;

public abstract class ParkingSpot {
	
	protected final int id;
	protected Vehicle vh;
	
	protected int price;
	protected boolean isEmpty=true;
	
	public ParkingSpot(int id,int price) {
		this.id =id;
		this.price= price;
	}
	
	abstract void parkVehicle(Vehicle vh);
	
	abstract void removeVehicle();
	
	public int getId() {
		return id;
	}
	
	public Vehicle getVh() {
		return vh;
	}
	public void setVh(Vehicle vh) {
		this.vh = vh;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}


}
