package userInput;

import java.util.Scanner;

public class ScannerUserInout {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		System.out.println(x);
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println(name);

	}

}
