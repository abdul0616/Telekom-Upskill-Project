

public class Developer extends Employee {
    private String stack;

    public Developer(String name, int id, double salary, String stack) {
        super(name, id, salary);
        this.stack = stack;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }
    
    
   @Override 
   public double calculateBonus() {
	   return getSalary() * 0.20;
   }

}


