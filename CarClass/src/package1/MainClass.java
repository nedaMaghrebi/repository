package package1;

public class MainClass {

	public static void main(String[] args) {
		CarClass car1 = new CarClass("Rio","a1",50);
		car1.printdata();
		car1.accelerate();
		car1.brake();
		car1.printdata();
		car1.refuel(10);

		CarClass car2 = new CarClass("Patrol","c1",40);
		car2.printdata();
		
		

	}

}
