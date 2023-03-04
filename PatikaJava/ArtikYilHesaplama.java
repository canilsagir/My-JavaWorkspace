import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {
		int year;

		Scanner scan = new Scanner(System.in);
		System.out.print("Yıl Giriniz :");
		year = scan.nextInt();

		if (year % 4 == 0 &&  year % 100 != 0 || year % 400 == 0) {

			System.out.println(year + " " + "Bir Artık Sayıdır !");
		}

		else {
			System.out.println(year + " " + "Bir Artık Sayı Degildir!");
		}
		
		
		
	}

}
