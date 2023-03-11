package Donguler;

import java.util.Scanner;

public class CiftSayıOrtalamaBulma {

	public static void main(String[] args) {

		int k, ortalama, sayi = 0, toplam =0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Sayi Giriniz :");
		k = scan.nextInt();

		for (int i = 0; i <= k; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				sayi += i;
				toplam ++;
			}
			
		}
		ortalama = sayi/toplam;
		System.out.println("Ortalama :"+ortalama);
	}

}
