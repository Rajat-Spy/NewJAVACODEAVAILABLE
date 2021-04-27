package conditionalStatement;

import java.util.Scanner;

public class MaxOfBothNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int c1 = a > b ? a : b;
		c1 = b > c ? b : c;
		System.out.println(c);

	}

}
