package Inheritance;

public class HomeDog extends Dog {
	protected String size;

    // inherit from Dog that Inherit from Animal
    public HomeDog (String color, int weight, int height,String type , int age , String size)
    {
    	super(color, weight,height,type,age);
    	this.size = size;
    }

    // Getters and Setters:
	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}
      
    
    

}