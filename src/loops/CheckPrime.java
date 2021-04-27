package loops;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n <0) {
			System.out.println("Invalid Number...");
		}
		if(n==1) {
			System.out.println("Neither Prime nor Composite...");
		}
		boolean isPrime = true;
		for(int i=2; i<n;i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Prime Number...");
		} else 
			System.out.println("Non-Prime Number...");

	}

}
