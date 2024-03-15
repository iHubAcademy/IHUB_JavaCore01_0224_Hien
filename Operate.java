package AirportManagement;

public class Operate extends Airport {
	private int count;
	/*
	 * private AirPlane[] airplane; private Helicopters[] helicopters;
	 */
	
	public Operate() {
		
	}
	public Operate(String iD, String name, long runwaySize, int fixedPlace, int rotatePlace, int count) {
		super(iD, name, runwaySize, fixedPlace, rotatePlace);
		this.count = count;
	}
	public Operate(int count) {
		this.count = count;
	}
	public void haCanh(AirPlane a) {
		if(this.checkCountAir() == false) return;
		this.count++;
		//airplane[airplane.length] = a;
	}
	public void haCanh(Helicopters a) {
		if(this.checkCountHeli() == false) return;
		//helicopters[helicopters.length] = a;
		this.count++;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public boolean checkCountAir() {
		if(this.count < this.getFixedPlace()) {
			return true;
		}
		else return false;
	}
	public boolean checkCountHeli() {
		if(this.count < this.getRotatePlace()) {
			return true;
		}
		else return false;
	}
	public int emptyNumber() {
		return this.getFixedPlace() + this.getRotatePlace() - this.count;
	}
}
