package loops;

import java.util.Scanner;

public class NumberRaisetoPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int pow = 1;
		for(int i=0;i<m;i++) {
			pow *= n;
		}
		System.out.println(pow);

	}

}
