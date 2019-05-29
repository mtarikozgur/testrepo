package day52_finalkeyword;

public class Computer {

	private String model;
	private String color;
	
	
	
	public Computer(String model, String color) {
		
		this.model = model;
		this.color = color;
		
	}

	@Override
	public boolean equals(Object other) { // other parameter is a different Computer object
		
		Computer that = (Computer) other;
		
		if(this.model.equals(that.model) && this.color.equals(that.color)) return true;
		
		return false;
		
	}

}
