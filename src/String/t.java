package src.String;

public class t {
	public void abc() {
	       
			
		}
           static String text = "samplecodez";
           static String str1 = text.replace('s', 'S');
           static String str2 = text.replaceAll(text, "Hello World Hello");
           static String str3 = str2.replaceFirst("Hello", "Java");
          // String str4 = str3.replaceAll(("(.*)Java(.*)","C#")
           
           
           public static void main(String[] args) {
           System.out.println(str1); // Samplecodez
           System.out.println(str2); // Hello World Hello
           System.out.println(str3); // Java World Hello
           //System.out.println(str4); // Java World Hello
           
           
}}

