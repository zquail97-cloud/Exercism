class ProductionRemoteControlCar<T> implements RemoteControlCar, Comparable<ProductionRemoteControlCar<T>> {

    int distanceTravelled;
    int numberOfVictories;
    
    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
       return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }


	@Override
	public int compareTo(ProductionRemoteControlCar<T> o) {

		return o.getNumberOfVictories() - this.getNumberOfVictories();
	}
}
