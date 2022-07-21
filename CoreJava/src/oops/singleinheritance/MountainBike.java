package oops.singleinheritance;

public class MountainBike extends Bicycle {

	public int seatHeight;

	public MountainBike(int gear, int speed, int s) {
		super(gear, speed);
		this.seatHeight = s;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		
		return super.toString()+ "MountainBike [seatHeight=" + seatHeight + "]";
	}

}
