package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime = true;
		
		for(int i = 2; i*i<n; i++) {
			if(n % i == 0) {
				prime = false;
				break;
			}
			
		
	}
		if(n<2) {
			prime = false;
		}
		System.out.println("isPrime: "+prime);

}
}
