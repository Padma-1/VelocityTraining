package oops.interfaceDemo;

public class Car {

	String company;
	boolean isAutomatic;
	String modelName;
	float highTechAc;
	String color;
	String fuelType;
	String power;
	int numberOfGear;

	public Car(String company, boolean isAutomatic, String modelName, float highTechAc, String color, String fuelType,
			String power, int numberOfGear) {
		this.company = company;
		this.isAutomatic = isAutomatic;
		this.modelName = modelName;
		this.highTechAc = highTechAc;
		this.color = color;
		this.fuelType = fuelType;
		this.power = power;
		this.numberOfGear = numberOfGear;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public float getHighTechAc() {
		return highTechAc;
	}

	public void setHighTechAc(float highTechAc) {
		this.highTechAc = highTechAc;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public int getNumberOfGear() {
		return numberOfGear;
	}

	public void setNumberOfGear(int numberOfGear) {
		this.numberOfGear = numberOfGear;
	}

}
