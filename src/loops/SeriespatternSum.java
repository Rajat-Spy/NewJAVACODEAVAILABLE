package loops;

import java.util.Scanner;

public class SeriespatternSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 1;
		for(float i =2;i<=n;i++) {
			if(i%2==0) {
				sum -= 1/i;
			} else 
				sum += 1/i;
		}
		System.out.println(sum);

	}

}
