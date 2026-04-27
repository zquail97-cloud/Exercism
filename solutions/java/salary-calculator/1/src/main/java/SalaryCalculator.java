public class SalaryCalculator {
    
    public double salaryMultiplier;
	public int bonusMultiplier;
	

	public double salaryMultiplier(int daysSkipped) {

		return salaryMultiplier = (daysSkipped >= 5) ? 0.85 : 1;

	}

	public int bonusMultiplier(int productsSold) {

		
		return bonusMultiplier = (productsSold >= 20) ? 13 : 10;
	}

    public double bonusForProductsSold(int productsSold) {
		
		return bonusMultiplier(productsSold) * productsSold;
	}

   public double finalSalary(int daysSkipped, int productsSold) {
		
		double baseSalary = 1000;
		double finalSalary = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
		
		
		return finalSalary = (finalSalary <= 2000.00) ? finalSalary : 2000.00;
		
	}
}
