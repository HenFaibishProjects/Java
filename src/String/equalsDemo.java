package src.String;

//Demonstrate equals() and equalsIgnoreCase().
public class equalsDemo {
     public static void main(String args[]) {
          String s1 = "Hello";
          String s2 = "Hello";
          String s3 = "Good-bye";
          String s4 = "HELLO";
          System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2)); // Hello equals Hello -> true
          System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3)); // Hello equals Good-bye -> false
          System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4)); // Hello equals HELLO -> false
          System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equalsIgnoreCase(s4)); // Hello equalsIgnoreCase HELLO -> true
     }
}
