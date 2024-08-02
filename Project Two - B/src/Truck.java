


	public class Truck extends Vehicle {
	    private String model;

	    public Truck(String type,String license, double rent, String model) {
	        super(type, license, rent);
	        this.model = model;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }
	    
	    @Override 
	    public double calculateRentalCost(int days) {
	 	   return getRent() * days;
	    }




	}


