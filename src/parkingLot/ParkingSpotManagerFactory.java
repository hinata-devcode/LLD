package parkingLot;

public class ParkingSpotManagerFactory {

	private SlotDao slotDao;

	public ParkingSpotManagerFactory(SlotDao slotDao) {
		this.slotDao = slotDao;
	}

	public ParkingSpotManager createManager(VehicleType type) {

		if (type == VehicleType.FourWheeler) {
			return new FourWheelerParkingSpotManager(slotDao.getFourWheelerList());
		} else {
			return new TwoWheelerParkingSpotManager(slotDao.getTwoWheelerList());
		}

	}

}
