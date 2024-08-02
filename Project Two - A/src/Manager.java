


	public class Manager extends Employee {
	    private String department;

	    public Manager(String name, int id, float salary, String department) {
	        super(name, id, salary);
	        this.department = department;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    
	    @Override 
	    public double calculateBonus() {
	 	   return getSalary() * 0.20;
	    }



	}


