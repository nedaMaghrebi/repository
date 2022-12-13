package package1;

public class CarClass {
	
	
       //attributes
		  public  String brand;

		  public  String model;

		  public  int amountOfFuel;
		  

		  public void brake() {

		    System.out.println("Car is breaking.");

		  }
		  

		   public int accelerate() {

		    if (amountOfFuel > 0) {

		      System.out.println("Car is accelerating");

		      amountOfFuel =amountOfFuel-1;

		      return amountOfFuel;

		    }

		    return amountOfFuel;

		   }

		    

		    public void printdata() {

		    System.out.println("brand :"+ brand );

		    System.out.println("model :" + model );

		    System.out.println("amountOfFuel:" + amountOfFuel);

		  }
		    

		    public void refuel( int refuel) {

		      refuel = amountOfFuel + refuel;

		      System.out.println("Fuel on the tank after the refuel:" +refuel);

		    }

		  public CarClass() {

		       brand ="";

		       model="";

		       amountOfFuel=0;

		  }

		  public CarClass(String brand,String model, int amountOfFuel ) {

		       this.brand =brand;

		       this.model=model;

		       this.amountOfFuel=amountOfFuel;

		  }

		 

		}


