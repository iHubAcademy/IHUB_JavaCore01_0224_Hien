package AirportManagement;

public class TestAirport {
	public static void main(String[] args) {
		//Airport airport = new Airport("123", "TSN", 200000, 5, 6);
		
		String IDAir = "VN12345", modelAir = "Boeing 01", planeTypeAir = "Airplane", flyMethodAir = "phan luc";
		long crulseSpeedAir = 100000, emptyWeightAir = 8000, maxTakeOffWeightAir = 15000;
		long minNeededRunaySize = 3600;
		AirPlane airplane = new AirPlane(IDAir, modelAir, planeTypeAir, flyMethodAir, crulseSpeedAir, emptyWeightAir, maxTakeOffWeightAir, minNeededRunaySize);
		Helicopters helicopters = new Helicopters();
		System.out.println(airplane.toString());
		Operate operate = new Operate("123", "TSN", 200000, 5, 6, 0);
		operate.haCanh(airplane);
		System.out.println(operate.getCount());
		System.out.println("So cho trong o san bay: " + operate.emptyNumber());
	}
}
