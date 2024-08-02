
public class Vehicle {
	
	private String type;
	private String license;
	private double rent;

	public Vehicle(String type,String license, double rent) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.license = license;
		this.rent = rent;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLicense() {
		return license;
	}
	
	public void setLicense(String license) {
		this.license = license;
	}
	
	public double getRent() {
		return rent;
	}
	
	public void setRent(double rent) {
		this.rent = rent;
	}
	

	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return 0;
	}

}
