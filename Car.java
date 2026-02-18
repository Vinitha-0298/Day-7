package abstraction;

public class Car implements Vehicle {

	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
        c.applyBrake();
		
	}

	@Override
	public void drive() {
		System.out.println("The driver is driving");
		
	}

	@Override
	public void applyBrake() {
	System.out.println("Brake is applied");
		
	}

}
