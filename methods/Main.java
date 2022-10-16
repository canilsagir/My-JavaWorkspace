package methods;

public class Main {

	public static void main(String[] args) {
		//KISA YOLDAN MAİNDE DEĞİŞİKLİK YAPILMAK İSTENDİĞİNDE YAZABİLİRİZ
		sayiBulmaca();
		
	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6 };

		int aranacak = 5;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				varMi = true;
				break;
			}

		}
		if (varMi) {

			mesajVer("Sayı mevcuttur: "+ aranacak);
		} else {
			mesajVer("Sayı mevcut değil "+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
		
	}
}
