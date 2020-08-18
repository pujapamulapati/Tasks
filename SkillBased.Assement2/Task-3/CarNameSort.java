package SkillBased;

import java.util.Comparator;

public class CarNameSort implements Comparator<CarDetails> {
@Override
	public int compare(CarDetails n1, CarDetails n2) {		
		return n1.getCarName().compareTo(n2.getCarName());
	}
}