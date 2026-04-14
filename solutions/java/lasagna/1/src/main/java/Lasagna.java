public class Lasagna {
 
    public int expectedMinutesInOven(){ 
    int minutes = 40;        
        return minutes;
    }

    public int remainingMinutesInOven(int actualMinutes){
      return expectedMinutesInOven() - actualMinutes;
    }
    
    public int preparationTimeInMinutes(int layers){   	
    	int minutes = 2;
    	int total = 0;
    	
    	total = layers * minutes;   	
		return total;
        
    }
    public int totalTimeInMinutes(int layers, int minutesInOven){		
    	return preparationTimeInMinutes(layers) + minutesInOven; 	
    }

}
