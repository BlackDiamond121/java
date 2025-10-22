package cote.exam1020;

public class ColorTire extends Tire {
	
	private String color;
	
	public ColorTire(String modelName, int maxRotation, String color) {
		super(modelName, maxRotation);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
