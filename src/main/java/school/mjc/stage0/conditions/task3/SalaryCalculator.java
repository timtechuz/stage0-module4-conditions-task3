package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
    	int taxes = 0;
    	if (salary <= 10000) {
    		// Basic Salary <= 10000: taxes - 15%.
    		taxes = salary * 15 / 100;
    		System.out.println("taxes - 15%");
    		System.out.println(taxes);
    		System.out.println("salary after taxes according will be: " + (salary - taxes));
    		
    	} else if (salary > 10000 && salary <= 20000) {
    		//10000 < Basic Salary <= 20000: taxes - 18%
    		taxes = salary * 18 / 100;
    		System.out.println("taxes - 18%");
    		System.out.println(taxes);
    		System.out.println("salary after taxes according will be: " + (salary - taxes));
    	 		
    	} else if (salary > 20000) {
    		//Basic Salary > 20000 : taxes - 20%
    		taxes = salary * 20 / 100;
    		System.out.println("taxes - 20%");
    		System.out.println(taxes);
    		System.out.println("salary after taxes according will be: " + (salary - taxes));
    	
    	} else if (salary < 0) {
    		System.out.println("wrong input!");
    	}
    }
    /**
    public static void main(String[] args) {
    	SalaryCalculator sc = new SalaryCalculator();
    	sc.calculateSalary(7351);
    }
    **/
}


