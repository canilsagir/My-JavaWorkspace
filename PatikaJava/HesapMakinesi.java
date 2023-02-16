import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int n1, n2, select;

		Scanner scan = new Scanner(System.in);

		System.out.print("İlk Sayıyı Giriniz :");
		n1 = scan.nextInt();
		System.out.print("İkinci Sayıyı Giriniz :");
		n2 = scan.nextInt();

		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminiz :");
		select = scan.nextInt();

		switch (select) {
		case 1:
			System.out.println("Toplam :" + (n1 + n2));
			break;
		case 2:
			System.out.println("Çıkarma :" + (n1 - n2));
			break;
		case 3:
			System.out.println("Çarpma :" + (n1 * n2));
			break;
		case 4:
			if (n2 != 0) {
				System.out.println("Bölme:" + (n1 / n2));
				break;
			} else {
				System.out.println("Bir Sayı 0'a Bölünemez!");
			}
		default:
			System.out.println("Yanlış Seçim Yaptınız. Tekrar Deneyiniz. ");
		}
	}

}
