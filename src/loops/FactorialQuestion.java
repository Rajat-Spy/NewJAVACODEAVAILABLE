package loops;

import java.util.Scanner;

public class FactorialQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int factorial = 1;
		for(int i = a; i>=1;i--) {
			factorial *= i;
		}
		System.out.println("The Factorial of the given number is " +factorial);

	}

}
