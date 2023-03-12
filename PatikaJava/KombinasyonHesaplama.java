package Donguler;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class KombinasyonHesaplama {

	public static void main(String[] args) {

		int n, r, total = 1, total2 = 1, total3 =1, c;
		Scanner scan = new Scanner(System.in);

		System.out.print("1.sayı :");
		n = scan.nextInt();
		System.out.print("2.sayı :");
		r = scan.nextInt();
		System.out.println("Kombinasyon İkilisi  :" + n + "," + r);
		
				
	 
		for (int i = 1, j = 1; i <= n; i++) {
			//N!
			total *= i;
			

		}
		for (int j = 1; j <= r; j++) {
			//R!
			total2 *= j;

		}
		for (int s = 1; s <= (n-r); s++) {
			//N-R!
			total3 *= s;
			
		}
		c = total/(total2*total3);
		System.out.println("Sonuç :"+c);
		
		
		
		
	}

}
