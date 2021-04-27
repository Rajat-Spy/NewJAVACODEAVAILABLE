package simpleInterest;
import java.util.*;
public class Calculate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle amount : ");
		int p = scan.nextInt();
		System.out.println("Enter the rate of Interest :");
		float r = scan.nextFloat();
		System.out.println("Enter the time Duration : ");
		int t = scan.nextInt();
		
		long SI = (long)(p*r*t)/100;
		System.out.println("The Simple Interest is : " +SI);

	}

}
