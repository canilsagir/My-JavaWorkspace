import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {
		int heat;

		Scanner scan = new Scanner(System.in);

		// ---------------DERS ÇÖZÜM KODLARI-------------------

		/*
		 * System.out.print("Sıcaklık Giriniz :"); heat = scan.nextInt();
		 * 
		 * 
		 * if (heat < 5) { System.out.println("Kayak Yapabilirsiniz."); } else if (heat
		 * <= 25) { if (heat <= 15) { System.out.println("Sinemeya Gidebilirsiniz"); }
		 * if (heat >= 10) { System.out.println("Piknik Yapabilirsiniz"); } } else {
		 * System.out.println("Yüzmeye Gidebilirsiniz."); }
		 */
		// ------------------Switch Case Yapısı
		System.out.println(
				"1:Sıcaklık 5'den küçükse\n2:Sıcaklık 5-15 arasındaysa\n3:Sıcaklık 15-25 arasındaysa\n4:Sıcaklık 25'ten büyükse");
		System.out.print("Seçiminiz :");
		heat = scan.nextInt();
		switch (heat) {
		case 1:

			System.out.println("Kayak Yapabilirsiniz.");

			break;
		case 2:

			System.out.println("Sinemaya Gidebilirsiniz.");
			break;
		case 3:
			System.out.println("Piknik Yapabilirsiniz.");
			break;
		case 4:
			System.out.println("Yüzmeye Gidebilirsiniz");
			break;
		default:
			System.out.println("Önerme İptal Edildi.");
		}

	}

}
