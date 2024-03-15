package AirportManagement;

public class AirPlane extends GeneralInfoAir{
	private long minNeededRunaySize;
	
	public AirPlane() {
		
	}

	public AirPlane(String iD, String model, String planeType, String flyMethod, long crulseSpeed, long emptyWeight,
			long maxTakeOffWeight, long minNeededRunaySize) {
		super(iD, model, planeType, flyMethod, crulseSpeed, emptyWeight, maxTakeOffWeight);
		// TODO Auto-generated constructor stub
		this.minNeededRunaySize = minNeededRunaySize;
	}

	public long getMinNeededRunaySize() {
		return minNeededRunaySize;
	}

	public void setMinNeededRunaySize(long minNeededRunaySize) {
		this.minNeededRunaySize = minNeededRunaySize;
	}

	@Override
	public String toString() {
		return super.toString() + " AirPlane [minNeededRunaySize=" + minNeededRunaySize + "]";
	}
	
}
