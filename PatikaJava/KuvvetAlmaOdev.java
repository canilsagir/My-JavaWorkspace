package Donguler;

import java.util.Scanner;

public class KuvvetAlmaOdev {

	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı Giriniz :");
		n = scan.nextInt();

		for (int i = 1, j = 1; i <= n && j <= n; i *= 4, j *= 5) {
			System.out.println(i +"\t" +  j);
		}

	}

}
