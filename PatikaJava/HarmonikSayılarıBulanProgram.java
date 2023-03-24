package Donguler;

import java.util.Scanner;

public class HarmonikSayılarıBulanProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("N sayısını Giriniz :");
		int n = scan.nextInt();
		double result = 0;

		/*
		 * for (double i=1; i<=n; i++) { result += (1/i);
		 * 
		 * } System.out.println(result);
		 */

		// WHİLE İLE YAPIMI
		double i = 1;
		while (i <= n) {
			
			result += 1 / i;
			i++;
		}
		System.out.println(result);
	}

}
