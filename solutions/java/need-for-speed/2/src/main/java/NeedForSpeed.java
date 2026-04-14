class NeedForSpeed {
	
	int speed;
	int batteryDrain;
	int battery = 100;
	int distance =0;
	
	public NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
	}

    public boolean batteryDrained() {
		return battery < batteryDrain;
        
    }

    public int distanceDriven() {
		return distance;
        
    }

    public void drive() {
        
    	if (batteryDrained()) return;
    	distance += speed;
    	battery -= batteryDrain;
    		
    	 
    }
    
    public static NeedForSpeed nitro() {
       
    	NeedForSpeed nitroCar = new NeedForSpeed(50, 4);
		return nitroCar;
    	
    }
}

class RaceTrack {

	int distance;

	public RaceTrack(int distance) {
		this.distance = distance;
	}

	public boolean canFinishRace(NeedForSpeed car) {

		while (!car.batteryDrained()) {
			car.drive();

		}
		if (car.distanceDriven() >= this.distance) {
			return true;
		}
		return false;

	}
}
