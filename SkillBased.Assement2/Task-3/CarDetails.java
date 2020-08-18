package SkillBased;

public class CarDetails {
	private int CarManfYear;
	private String CarName;
	private int CarID;
	
	public int getCarManfYear() {
		return CarManfYear;
	}
	
	public void setCarManfYear(int carManfYear) {
		CarManfYear = carManfYear;
	}


	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public int getCarID() {
		return CarID;
	}

	public void setCarID(int carID) {
		CarID = carID;
	}
	

	public CarDetails(int carManfYear, String carName, int carID) {
		super();
		CarManfYear = carManfYear;
		CarName = carName;
		CarID = carID;
	}
	

	@Override
	public String toString() {
		return "CarDetails [CarManfYear=" + CarManfYear + ", CarName=" + CarName + ", CarID=" + CarID + "]";
	}
	public void DisplayCarDetails() {		
		System.out.println("CarManfYear= " + CarManfYear + ", CarName= " + CarName + ", CarID= " + CarID );
	}

	public CarDetails()  {
		
	}

}
