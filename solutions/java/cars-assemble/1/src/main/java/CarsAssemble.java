public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        
    	double productionRate = 0;
    	int cars = 221;
    	
    	if (speed >=1 && speed <= 4) {
    		productionRate = 100;
		} else if (speed >=5 && speed <= 8) {
			productionRate = 90;
		} else if (speed == 9) {
			productionRate = 80;
		} else if (speed == 10) {
			productionRate = 77;
		}
    	
    	return speed * cars *productionRate/100;
    }

     public int workingItemsPerMinute(int speed) {
         
    	return (int) productionRatePerHour(speed)/60;
    }
}
