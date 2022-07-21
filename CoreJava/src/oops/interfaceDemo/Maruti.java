package oops.interfaceDemo;

public class Maruti implements NewCarModel {

	Car car = new Car("Maruti", true, "Brezza", 5.1f, "white", "petrol", "200bhp", 6);

	public void CarFeatures() {
		System.out.println("Brand name : " + car.getCompany());
		System.out.println("Colour of car :" + car.getColor());
		System.out.println("Power : " + car.getPower());
		System.out.println("fuel type : " + car.getFuelType());
		System.out.println("No of gears : " + car.getNumberOfGear());
	}

	@Override
	public void isAutomatic() {
		System.out.println("Is this car automatic :" + car.isAutomatic());

	}

	@Override
	public void modelName() {
		System.out.println("Model Name  : " + car.getModelName());

	}

	@Override
	public void highTechAc() {
		System.out.println("AC spec : " + car.getHighTechAc());
	}

}
