package Donguler;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class AtmProjesi {

	public static void main(String[] args) {
		int kalanHak = 3, balance = 1500;
		int select;
		String password, userName;
		Scanner scan = new Scanner(System.in);

		while (kalanHak > 0) {
			System.out.print("Kullanıcı Adınız :");
			userName = scan.nextLine();
			System.out.print("Şifreniz Adınız :");
			password = scan.nextLine();

			if (userName.equals("cas") && password.equals("cas123")) {
				System.out.println("Merhaba, Kodluyoruz Bankasına Hoş Geldiniz.");
				do {

					System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgualama\n4-Çıkış Yap");
					System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz :");
					select = scan.nextInt();

					switch (select) {
					case 1:
						System.out.print("Yatırılacak Tutar Giriniz :");
						int price = scan.nextInt();
						balance += price;
						System.out.println("İşlem Sonrası Bakiyeniz :" + balance);
						System.out.println("---------------");
						break;
					case 2:
						System.out.print("Para Çekmek İstediğiniz Tutarı Yazınız :");
						int girdi = scan.nextInt();
						if (girdi > balance) {
							System.out.print("Bakiye Yetersiz.");
						} else {
							balance -= girdi;
							System.out.println("Çekim Sonrası Bakiyeniz :" + balance);
						}
						System.out.println("---------------");

						break;
					case 3:
						System.out.print("Mevcut Bakiyeniz : " + balance);
						System.out.println("---------------");
						break;
					case 4:
						System.out.println("Sisten Çıkış Yapılıyor. ");

						break;
					}

				} while (select != 4);
				System.out.println("Kartınızı Almayı Unutmayın!");
				break;
			} else {
				kalanHak--;
				System.out.println("Hatalı Girdiniz! Tekrar Deneyiniz!");
				if (kalanHak == 0) {
					System.out.println("Hesabınız Bloke Oldu. Banka ile İletişime Geçin!");
				} else {
					System.out.println("Kalan Hakkınız : " + kalanHak);
				}
			}

		}

	}

}
