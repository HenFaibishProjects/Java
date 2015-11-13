package SimplePractice;

import java.util.Scanner;

public class MathExercises {

	public void checkoddeven() {
		int imp;

		Scanner scan = new Scanner(System.in);
		try {
			imp = scan.nextInt();
			if (imp % 2 == 0)
				System.out.println("You entered an even number.");
			else
				System.out.println("You entered an odd number.");

		} catch (Exception e) {
			System.out.println("You entered none valid number.");
		}
		scan.close();
	}

	public void primeCheck() {
		int temp;
		int y = 0;
		int num;
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter a number for check:");
			num = scan.nextInt();
			scan.close();

			for (int i = 2; i <= num / 2; i++) {
				temp = num % i;
				if (temp == 0) {
					y = 1;
					break;
				}
			}
			if (y == 1)
				System.out.println(num + " is Prime Number");
			else
				System.out.println(num + " is not Prime Number");
		} catch (Exception e) {
			System.out.println("You entered none valid number.");
		}
		scan.close();
	}
}