package week1.day1;

public class Car {
	
	private void driveCar() {
		
		System.out.println("drive");
	}
	
	private void applyBrake() {
		
		System.out.println("break");
	}
	
	private void soundHorn() {
		
		System.out.println("horn");
	}
	
	private void isPuncture() {
		
		System.out.println("puncture");
	}

	public static void main(String[] args) {
		
		Car x = new Car();
		x.driveCar();
		x.applyBrake();
		x.soundHorn();
		x.isPuncture();
	
	}
}
