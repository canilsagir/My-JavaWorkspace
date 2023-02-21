import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {
		int ort=0, mat , fizik , turkce , kimya , muzik ;
		

		Scanner scan = new Scanner(System.in);

		System.out.print("Matematik Notunuzu Giriniz :");
		mat = scan.nextInt();
		System.out.print("Türkçe Notunuzu Giriniz :");
		turkce = scan.nextInt();
		System.out.print("Fizik Notunuzu Giriniz :");
		fizik = scan.nextInt();
		System.out.print("Kimya Notunuzu Giriniz :");
		kimya = scan.nextInt();
		System.out.print("Müzik Notunuzu Giriniz :");
		muzik = scan.nextInt();
		;
		if(mat >= 0 && mat  <=100) {
			ort += mat;
					
		}
		else if(fizik >= 0 && fizik  <=100) {
			ort += fizik;
					
		}
		else if(kimya >= 0 && kimya  <=100) {
			ort += kimya;
					
		}else if(muzik >= 0 && muzik  <=100) {
			ort += muzik;
					
		}else if(turkce >= 0 && turkce  <=100) {
			ort += turkce;
				
		}else {
			System.out.println("Geçerli Bir Not Girmediniz.");
			
				
			
		}
		ort = (mat+kimya+fizik+muzik+turkce) /5;
		
		
		
		if(ort <= 55) {
			System.out.println("\nSınıfta Kaldınız. Seneye Tekrar Görüşmek Üzere!");
			
			
		}else {
			System.out.println("Tebrikler sınıfı geçtiniz");
			
		}
		System.out.print("Ortalamanız : "+ ort);
	}

}