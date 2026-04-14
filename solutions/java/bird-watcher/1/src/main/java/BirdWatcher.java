
class BirdWatcher {
	private final int[] birdsPerDay;
	public int [] lastWeek = {0, 2, 5, 3, 7, 8, 4};
	
	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay.clone();
	}

	public int[] getLastWeek() {

		return lastWeek;
	}

	public int getToday() {

		int todayCount = 0;

		for (int i = 0; i < birdsPerDay.length; i++) {
			if (i == birdsPerDay.length - 1) {
				todayCount = birdsPerDay[i];
			}
		}
		return todayCount;
	}

	public int incrementTodaysCount() {

		int today;
		today = birdsPerDay.length-1; 
		birdsPerDay[today] = birdsPerDay[today]+1;
		return birdsPerDay[today];
	}

	public boolean hasDayWithoutBirds() {

		for (int birds : birdsPerDay) {

			if (birds == 0) {
				return true;
			} 
			
		}

		return false;

	}

	public int getCountForFirstDays(int numberOfDays) {
	    int count = 0;
	    int limit = Math.min(numberOfDays, birdsPerDay.length);

	    for (int i = 0; i < limit; i++) {
	        count += birdsPerDay[i];
	    }

	    return count;
	}

	public int getBusyDays() {
		
		int count = 0;
		int busy = 5;
		
		for (int i = 0; i < birdsPerDay.length; i++) {
			
			if (birdsPerDay[i] >=busy) {
				count++;
			}
		}
		return count;
		
	}
}
