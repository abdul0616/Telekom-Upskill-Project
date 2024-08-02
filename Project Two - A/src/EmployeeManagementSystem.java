
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee [] employees = new Employee[6];
		
		employees[0] = new Manager("Abaidoo Prince",1,20000,"FrontEnd");
		employees[1] = new Manager("Adolf Menano",2,30000,"Software Tester");
		employees[2] = new Developer("Godsway Kojo Nyatuame",3,15000,"Cypress");
		employees[3] = new Developer("Godfred Harrison Amoah",4,15000,"Javascript");
		employees[4] = new Developer("Isaac Ampomah",5,15000,"AngularJs");
		employees[5] = new Developer("Usman Abdul Matin",1,200000,"Python");
		
		
		for(Employee employee: employees) {
			System.out.println(employee.getName() + " with and id: "+
		   employee.getId()+ " has a base salary of $" + 
		   employee.getSalary()+ " and a bonus of $" + 
		   employee.calculateBonus() );
		}
		

	}

}
