package conditionalStatement;

import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<10) {
			System.out.println("This is too small for this ride !..");
		} else if(n>=10 && n<20) {
			System.out.println("This ride is for this kid !..");
		} else {
			System.out.println("You are too old for this ride !..");
		}
		

	}

}
