package src.Inheritance;

public class Dog extends Animal {
    // should be protected in order to use them in inheritance
	protected String type;
	protected int age;
    
	
	public Dog(String color, int weight, int height,String type , int age) {
		super(color, weight,height);
		this.type = type;
		this.age = age;
	}

    // Getters and Setters:
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	}

