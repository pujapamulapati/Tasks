package SkillBased;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class MainDetails {
	Map<String, List<CarDetails>> Section1;

	public void displayByShowroomName1(String name) {
		List<CarDetails> cars = Section1.get(name);
		
		for(CarDetails car:cars)
		{
					System.out.println(car);
		}	
		System.out.println();
	}
	Map<String, List<CarDetails>> Section2;

	public void displayByShowroomName2(String name) {
		List<CarDetails> cars = Section2.get(name);
		
		System.out.println("Sort based on Manf-Year");
		Collections.sort(cars, new ManfYearSort());		
		for(CarDetails car:cars)
		{
			System.out.println(car);
			
		}
		System.out.println();
		
		
		System.out.println("Sort based on Name");
		Collections.sort(cars, new CarNameSort());		
		for(CarDetails car:cars)
		{
			System.out.println(car);
			
		}
		System.out.println();
	}

	Map<String, List<CarDetails>> Section3;

	public void displayByShowroomName3(String name) {
		List<CarDetails> cars = Section3.get(name);
		
		System.out.println("Display based on Manf-Year");
		Collections.sort(cars, new ManfYearSort());		
		for(CarDetails car:cars)
		{
			car.DisplayCarDetails();
			
		}
		System.out.println();
		
		
		System.out.println("Display based on Name");
		Collections.sort(cars, new CarNameSort());		
		for(CarDetails car:cars)
		{
			car.DisplayCarDetails();
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		CarDetails car1 = new CarDetails(111,"Lamborghini Diablo",2001);
		CarDetails car2 = new CarDetails(112,"Ford F-150 Raptor",1990);
		CarDetails car3 = new CarDetails(113,"Ferrari Testarossa",1998);
		CarDetails car4 = new CarDetails(114,"Porsche 911 Carrera",1994);
		CarDetails car5 = new CarDetails(115,"Suzuki Samurai",1987);
		
		List<CarDetails> cars11 = new Vector<CarDetails>();
		
		cars11.add(car1);
		cars11.add(car2);
		cars11.add(car3);
		cars11.add(car4);
		cars11.add(car5);
		
		ShowRoom showroom1 = new ShowRoom("CarShowRoom",11,cars11);
		
		CarDetails car7 = new CarDetails(211,"Jeep Gladiator",2002);
		CarDetails car8 = new CarDetails(212,"Land Rover Defender",1991);
		CarDetails car9 = new CarDetails(213,"Rolls-Royce",1999);
		CarDetails car10 = new CarDetails(214,"Ferrari 812 Superfast",1995);
		CarDetails car11 = new CarDetails(215,"Jensen Interceptor",1988);
		
		
		List<CarDetails> cars22 = new Vector<CarDetails>();
		
		cars22.add(car7);
		cars22.add(car8);
		cars22.add(car9);
		cars22.add(car10);
		cars22.add(car11);
		
		ShowRoom showroom2 = new ShowRoom("Car-World",22,cars22);
	
		
		CarDetails car12 = new CarDetails(311,"McLaren Senna",2003);
		CarDetails car13 = new CarDetails(312,"Ford Cortina",1992);
		CarDetails car14 = new CarDetails(313,"Chevrolet Tornado",2000);
		CarDetails car15 = new CarDetails(314,"Seat Tarraco",1997);
		CarDetails car16 = new CarDetails(315,"Ford Lobo",1989);
		
		
		List<CarDetails> cars33 = new Vector<CarDetails>();
		
		cars33.add(car12);
		cars33.add(car13);
		cars33.add(car14);
		cars33.add(car15);
		cars33.add(car16);
		
		ShowRoom showroom3 = new ShowRoom("CarShowRoom-World",33,cars33);
		
		MainDetails pp = new MainDetails();
		
		pp.Section1=new HashMap<String,List<CarDetails>>();
	    pp.Section1.put(showroom1.getShowroomName(), showroom1.getCars());
	    pp.Section1.put(showroom2.getShowroomName(), showroom2.getCars());
		pp.Section1.put(showroom3.getShowroomName(), showroom3.getCars());				
		pp.displayByShowroomName1("CarShowRoom");	

		pp.Section2=new HashMap<String,List<CarDetails>>();
		pp.Section2.put(showroom1.getShowroomName(), showroom1.getCars());
		pp.Section2.put(showroom2.getShowroomName(), showroom2.getCars());
		pp.Section2.put(showroom3.getShowroomName(), showroom3.getCars());			
		pp.displayByShowroomName2("Car-World");

	    pp.Section3=new HashMap<String,List<CarDetails>>();
		pp.Section3.put(showroom1.getShowroomName(), showroom1.getCars());
		pp.Section3.put(showroom2.getShowroomName(), showroom2.getCars());
		pp.Section3.put(showroom3.getShowroomName(), showroom3.getCars());				
		pp.displayByShowroomName3("CarShowRoom-World");
		
	
		
	}

}