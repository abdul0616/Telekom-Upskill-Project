


	public class Car extends Vehicle {
	    private String model;

	    public Car(String type,String license, double rent, String model) {
	        super(type, license, rent);
	        this.model = model;
	    }

	    public String getmodel() {
	        return model;
			
	    }

	    public void setmodel(String fueltype) {
	        this.model = fueltype;
	    }
	    
	    @Override 
	    public double calculateRentalCost(int days) {
	 	   return getRent() * days;
	    }



	}


