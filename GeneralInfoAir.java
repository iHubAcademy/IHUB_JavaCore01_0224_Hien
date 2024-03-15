package AirportManagement;

public class GeneralInfoAir {
	private String ID, model, planeType, flyMethod;
	private long crulseSpeed, emptyWeight, maxTakeOffWeight;
	
	public GeneralInfoAir() {
		
	}

	public GeneralInfoAir(String iD, String model, String planeType, String flyMethod, long crulseSpeed,
			long emptyWeight, long maxTakeOffWeight) {
		this.ID = iD;
		this.model = model;
		this.planeType = planeType;
		this.flyMethod = flyMethod;
		this.crulseSpeed = crulseSpeed;
		this.emptyWeight = emptyWeight;
		this.maxTakeOffWeight = maxTakeOffWeight;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public String getFlyMethod() {
		return flyMethod;
	}

	public void setFlyMethod(String flyMethod) {
		this.flyMethod = flyMethod;
	}

	public long getCrulseSpeed() {
		return crulseSpeed;
	}

	public void setCrulseSpeed(long crulseSpeed) {
		this.crulseSpeed = crulseSpeed;
	}

	public long getEmptyWeight() {
		return emptyWeight;
	}

	public void setEmptyWeight(long emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	public long getMaxTakeOffWeight() {
		return maxTakeOffWeight;
	}

	public void setMaxTakeOffWeight(long maxTakeOffWeight) {
		this.maxTakeOffWeight = maxTakeOffWeight;
	}

	@Override
	public String toString() {
		return "GeneralInfoAir [ID=" + ID + ", model=" + model + ", planeType=" + planeType + ", flyMethod=" + flyMethod
				+ ", crulseSpeed=" + crulseSpeed + ", emptyWeight=" + emptyWeight + ", maxTakeOffWeight="
				+ maxTakeOffWeight + "]";
	}
	
	
}
