package Donguler;

import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {
		int n, k, sonuc = 1;
		Scanner scan = new Scanner(System.in);

		System.out.print("Taban Sayı :");
		n = scan.nextInt();
		System.out.print("Kuvvet Olacak Sayı :");
		k = scan.nextInt();

		for (int i = 1; i<=k;  i++) {
			sonuc *= n;
		}
		System.out.println("Sonuç :" + sonuc);

	}

}
