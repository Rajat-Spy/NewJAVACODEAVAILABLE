package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 1;
		for(float i=2;i<=n;i++) {
			sum += 1/i;
		}
		System.out.println(sum);

	}

}
