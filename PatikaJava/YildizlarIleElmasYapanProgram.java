package Donguler;

import java.util.Scanner;

public class YildizlarIleElmasYapanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Basamak Sayısını Giriniz :");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
				
			}
			
			
			System.out.println();
		}
		for (int a = 1; a <= n - 1; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * (n-a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
