
public class VehicleRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle [] vehicles = new Vehicle[4];
		
		vehicles[0] = new Car("Aston Martin","DvLA 90889",20000,"Hyundai");
		vehicles[1] = new Car("Lamborgini","DvLA 909009",40000,"Toyota");
		vehicles[2] = new Bike("Road Bike","DvLA-12",4100,"BMW");
		vehicles[3] = new Truck("Tanker","DvLA-109982",410900,"Ford");
		
		
		for(Vehicle vehicle: vehicles) {
			System.out.println(vehicle.getType() + " with license: "+ 
		   vehicle.getLicense()+  " hired for 10 days amount to $ " + 
		   vehicle.calculateRentalCost(10));
		}
		

	}

}
