package week1.day1;

public class Car {
	
	private void driveCar() {
		
		System.out.println(1);
	}
	
	private void applyBrake() {
		
		System.out.println(2);
	}
	
	private void soundHorn() {
		
		System.out.println(3);
	}
	
	private void isPuncture() {
		
		System.out.println(4);
	}

	public static void main(String[] args) {
		
		Car x = new Car();
		x.driveCar();
		x.applyBrake();
		x.soundHorn();
		x.isPuncture();
	
	}
}
