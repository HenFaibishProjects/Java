package Inheritance;

public class Main {
	public static void main(String[] args){
		
		
		
		// creating dog object - inherit from animal
		Dog kobi = new Dog("red",40,40,"zeev",44);
		// in the printing i can use the getter from the animal (parent)
		System.out.println(kobi.age + " " + kobi.color);
		
		// creating HomeDog object - inherit from Dog
		HomeDog lacky = new HomeDog("red",20,10,"pudel",50,"big");
		System.out.println(lacky.age + " " +  lacky.type);
	}
}
