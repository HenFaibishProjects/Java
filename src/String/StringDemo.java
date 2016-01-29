package src.String;


public class StringDemo {

	public void  String_Ex1() {

		String text = "Hello SampleCodez";
		System.out.println(text); //Hello SampleCodez

	}

	public void String_Ex2() {


		char[] charArray = {'J', 'A', 'V', 'A' };
		String text = new String(charArray);
		System.out.println(text); // JAVA
	}


	public void String_Ex3() {

		{
			String text = "samplecodez.com";
			if(text.isEmpty());
			else         
				System.out.println(text.length()); // 15
		}
	}


	public void String_Ex4() {


		String text1 = "samplecodez";
		String text2 = "com";
		String ans1 = "samplecodez".concat(".").concat("com");
		String ans2 = text1.concat(".").concat("com");
		String ans3 = text1.concat(".").concat(text2);
		String ans4 = text1 + "." + text2;

		System.out.println(ans1); // samplecodez.com
		System.out.println(ans2); // samplecodez.com          
		System.out.println(ans3); // samplecodez.com          
		System.out.println(ans4); // samplecodez.com          
	}



	public void String_Ex5() {

		String text = "samplecodez";
		int index = text.charAt(5);
		char ch = text.charAt(5);
		int indexOf = text.indexOf('e');
		int lastIndexOf = text.lastIndexOf('e');

		System.out.println("ASCII value : " + index); // ASCII value : 101
		System.out.println("Value for index '5' is : "+ ch); // Value for index '5' is : e
		System.out.println("\nFirst index of 'e' : " + indexOf); // First index of 'e' : 5
		System.out.println("Last index of 'e' : " + lastIndexOf); // Last index of 'e' : 9
	}


	public void String_Ex6() {

		String text = "samplecodez";
		int val1 = text.compareTo("samplecodez");
		int val2 = text.compareTo("Samplecodez");
		int val3 = text.compareToIgnoreCase("sampleCODEZ");

		System.out.println("If value is 0, both are equal. Otherwise not equal.");
		System.out.println("\n" + val1); // 0
		System.out.println(val2); //32
		System.out.println(val3); //0
	}



	public void String_Ex7() {

		String text = "samplecodez";
		boolean val1 = text.contentEquals("sample");
		boolean val2 = text.contentEquals("samplecodez");
		boolean val3 = text.contentEquals("Samplecodez");

		System.out.println("If value is 'true', both are equal..");
		System.out.println("If value is 'false', both are not equal..\n");
		System.out.println(val1); //false
		System.out.println(val2); // true
		System.out.println(val3); //false
	}


	public void String_Ex8() {

		String text = "samplecodez";

		int codeAt = text.codePointAt(1);
		int codeAtBefore = text.codePointBefore(2);
		int codeCount = text.codePointCount(1, 6);
		boolean contain1 = text.contains("code");
		boolean contain2 = text.contains("co De");

		System.out.println("ASCII value of 'a' : " + codeAt); // ASCII value of 'a' : 97
		System.out.println("ASCII value of 'a' : " + codeAtBefore); // ASCII value of 'a' : 97
		System.out.println("Char count is : " + codeCount); //Char count is : 5

		System.out.println("\nCheck the content is " +
				"available in the string or not : " + contain1);
		// Check the content is available in the string or not : true
		System.out.println("Check the content is " +
				"available in the string or not : " + contain2);
		//Check the content is available in the string or not : false
	}



	public void String_Ex9() {

		String text = "samplecodez";

		boolean start = text.startsWith("samp");
		boolean end = text.endsWith("dez");
		boolean start_case = text.startsWith("sAmp");
		boolean end_case = text.endsWith("Dez");

		System.out.println("true - the content is available in the string");
		System.out.println("false - the content is not available in the string\n");
		System.out.println(start); // true
		System.out.println(end); // true
		System.out.println(start_case); //false
		System.out.println(end_case); //false
	}


	public void String_Ex10() {

		String text = "samplecodez";
		String str1 = text.replace('s', 'S');
		String str2 = text.replaceAll(text, "Hello World Hello");
		String str3 = str2.replaceFirst("Hello", "Java");

		System.out.println(str1); // Samplecodez
		System.out.println(str2); // Hello World Hello
		System.out.println(str3); // Java World Hello

	}  }

