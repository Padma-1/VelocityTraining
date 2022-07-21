package oops.singleinheritance;

public class Bicycle {
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBreak(int decrement)
	{
		speed-=decrement;
	}
	
	public void speedUp(int increment) {
		speed+=increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
	
}
