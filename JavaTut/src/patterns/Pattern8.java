package patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i==1 || i==n) {
				for(int j=1; j<=i; j++) {
					System.out.print("* ");
				}
			}
			else {
				System.out.print("* ");
				for(int j=1; j<=i-2; j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
