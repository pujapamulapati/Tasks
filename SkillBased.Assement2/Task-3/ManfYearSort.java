package SkillBased;

import java.util.Comparator;

public class ManfYearSort implements Comparator<CarDetails> {

	@Override
	public int compare(CarDetails p1, CarDetails p2) {		
		return p1.getCarManfYear() - p2.getCarManfYear();
	}

}