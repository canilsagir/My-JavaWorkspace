import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {

		int km, yas, yolculukTipi, yasIndirimi, toplamTutar, normalTutar, gidisDonusIndirimi, indirimliTutar;

		double kmBasiUcret = 0.10;

		Scanner scan = new Scanner(System.in);

		System.out.print("Gideceğiniz Mesafe Bilgisini Giriniz :");
		km = scan.nextInt();
		System.out.print("Yaşınızı Belirtiniz :");
		yas = scan.nextInt();
		System.out.print("Yolculuk Tipinizi Seçiniz :\n1-Tek Yön\n2-Gidiş-Dönüş Yön\n");
		System.out.print("Seçiminiz :");
		yolculukTipi = scan.nextInt();

		normalTutar = (int) (km * kmBasiUcret);
		yasIndirimi = (int) (normalTutar * 0.10);
		indirimliTutar = (int) (normalTutar - yasIndirimi);
		gidisDonusIndirimi = (int) (indirimliTutar * 0.20);

		if (km > 0 && yas > 0 && yolculukTipi == 1) {
			if (yas < 12 & yas > 0) {
				normalTutar = normalTutar / 2;
				System.out.println("Toplam Tutar :" + normalTutar);
			} else if (yas > 12 & yas < 24) {
				yasIndirimi = (int) (normalTutar * 0.10);
				toplamTutar = (normalTutar - yasIndirimi);
				System.out.println("Toplam Tutar :" + toplamTutar);
			} else if (yas > 65) {
				int indirimliTutar2 = (int) (normalTutar * 0.30);
				int yeniTutar = normalTutar - indirimliTutar2;
				System.out.println("Toplam Tutar :" + yeniTutar);
			} else {
				System.out.println("Toplam Tutar :" + normalTutar);
			}

		}else if (km > 0 && yas > 0 && yolculukTipi == 2) {
			if (yas < 12 & yas > 0) {
				normalTutar = normalTutar / 2;
				System.out.println("Toplam Tutar :" + normalTutar);
			} else if (yas > 12 & yas < 24) {
				toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
				gidisDonusIndirimi = (int) (indirimliTutar * 0.20);
				System.out.println("Toplam Tutar :" + toplamTutar);
			} else if (yas > 65) {
				int indirimliTutar2 = (int) (normalTutar * 0.30);
				int yeniTutar = normalTutar - indirimliTutar2;
				System.out.println("Toplam Tutar :" + yeniTutar);
			} else {
				System.out.println("Toplam Tutar :" + normalTutar);
			}

		} else {

			System.out.println("Hatalı Veri Girdiniz!");
		}

	}

}
