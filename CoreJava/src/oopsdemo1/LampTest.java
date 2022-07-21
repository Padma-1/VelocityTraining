package oopsdemo1;


//Lamp and LampTest in same file
//instance class 
class Lamp{
	
	//stores the value for light
	//true if light is on
	//false if light is off
	boolean isOn;
	
	//method to turn on the light\
	void turnOn() {
		isOn=true;
		System.out.println("Light on? "+isOn);
	}
	
	//method to turn off the light
	void turnOff() {
		isOn=false;
		System.out.println("Light on? "+isOn);
	}
}

public class LampTest {

	public static void main(String[] args) {
		
		//create object led & halogen
		
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		//switch on led & halogen
		led.turnOn();
		halogen.turnOn();
		
		//switch off led & halogen
		led.turnOff();
		halogen.turnOff();

	}

}
