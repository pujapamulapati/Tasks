package SkillBased;

import java.util.List;

public class ShowRoom {
	private String ShowroomName;
	private int ShowroomAddress;
	List<CarDetails> cars;
	public String getShowroomName() {
		return ShowroomName;
	}
	public void setShowroomName(String showroomName) {
		ShowroomName = showroomName;
	}
	public int getShowroomAddress() {
		return ShowroomAddress;
	}
	public void setShowroomAddress(int showroomAddress) {
		ShowroomAddress = showroomAddress;
	}
	public List<CarDetails> getCars() {
		return cars;
	}
	public void setCars(List<CarDetails> cars) {
		this.cars = cars;
	}
	public ShowRoom(String showroomName, int showroomAddress, List<CarDetails> cars) {
		super();
		ShowroomName = showroomName;
		ShowroomAddress = showroomAddress;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "ShowRoom [ShowroomName=" + ShowroomName + ", ShowroomAddress=" + ShowroomAddress + ", cars=" + cars
				+ "]";
	}
	public List<CarDetails> getcars() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
