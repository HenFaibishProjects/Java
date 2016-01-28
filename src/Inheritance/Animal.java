package Inheritance;

	
	// create the first (top hierarchy) object
	public class Animal {
		
		protected String color;
		protected int weight;
		protected int height;
		
	

		// Constructor 1 with full parameters
	public Animal(String color,int weight , int height) {
	      this.color = color;
	      this.height = height;
	      this.weight = weight;

	
	}



	// Getters and Setters
	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public int getWeight() {
		return weight;
	}




	public void setWeight(int weight) {
		this.weight = weight;
	}




	public int getHeight() {
		return height;
	}




	public void setHeight(int height) {
		this.height = height;
	}

	}



