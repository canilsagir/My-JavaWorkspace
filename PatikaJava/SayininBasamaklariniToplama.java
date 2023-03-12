package Donguler;

import java.util.Scanner;

public class SayininBasamaklariniToplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi Giriniz :");
		int number = scan.nextInt();

		int tempNumber = number, basDegeri, result = 0;

		while (tempNumber != 0) {
			
			basDegeri = tempNumber % 10;
			tempNumber /= 10;
			
			result += basDegeri;
		}
		System.out.println("Girilen Sayının Rakamları Toplamı :" + result);

	}

}
