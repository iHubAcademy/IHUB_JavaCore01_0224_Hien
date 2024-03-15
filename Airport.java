package AirportManagement;

public class Airport {
	private String ID, name;
	private long runwaySize;
	private int fixedPlace, rotatePlace;
	
	public Airport() {
		
	}

	public Airport(String iD, String name, long runwaySize, int fixedPlace, int rotatePlace) {
		ID = iD;
		this.name = name;
		this.runwaySize = runwaySize;
		this.fixedPlace = fixedPlace;
		this.rotatePlace = rotatePlace;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRunwaySize() {
		return runwaySize;
	}

	public void setRunwaySize(long runwaySize) {
		this.runwaySize = runwaySize;
	}

	public int getFixedPlace() {
		return fixedPlace;
	}

	public void setFixedPlace(int fixedPlace) {
		this.fixedPlace = fixedPlace;
	}

	public int getRotatePlace() {
		return rotatePlace;
	}

	public void setRotatePlace(int rotatePlace) {
		this.rotatePlace = rotatePlace;
	}
}
