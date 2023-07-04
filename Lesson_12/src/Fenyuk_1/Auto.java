package Fenyuk_1;

import Fenyuk_1.Engine;
import Fenyuk_1.Helm;

public class Auto {
	
	private int numberOfHorsePower;
	private int yearOfManufacture;
	private Engine engine;
	private Helm helm;
	
	public Auto(int numberOfHorsePower, int yearOfManufacture, Helm helm, Engine engine) {
		super();
		this.numberOfHorsePower = numberOfHorsePower;
		this.yearOfManufacture = yearOfManufacture;
		this.engine = engine;
		this.helm = helm;
	}

	public int getNumberOfHorsePower() {
		return numberOfHorsePower;
	}

	public void setNumberOfHorsePower(int numberOfHorsePower) {
		this.numberOfHorsePower = numberOfHorsePower;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	@Override
	public String toString() {
		return "Auto [numberOfHorsePower=" + numberOfHorsePower + ", yearOfManufacture=" + yearOfManufacture
				+ ", engine=" + engine + ", helm=" + helm + "]";
	}
	
	

}
