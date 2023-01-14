import java.util.Scanner;

public class NotOrtalamaHesaplama {

	public static void main(String[] args) {
		
	
	//Değişkenleri oluştur
	
	int mat,fizik,kimya,turkce,tarih,muzik;
	
	//Kullanıcıdan değer almak için Scanner sınıfını import et
	Scanner scan = new Scanner(System.in);
	//Kullanıdan değerleri al
	System.out.print("Matematik Notunuz :");
	mat = scan.nextInt();
	
	
	System.out.print("Fizik Notunuz :");
	fizik = scan.nextInt();
	System.out.print("Kimya Notunuz :");
	kimya = scan.nextInt();
	System.out.print("Türkçe Notunuz :");
	turkce = scan.nextInt();
	System.out.print("Tarih Notunuz :");
	tarih = scan.nextInt();
	System.out.print("Muzik Notunuz :");
	muzik = scan.nextInt();
	
	// İF ELSE KULLANARAK DERSİ GEÇME VEYA BULMA
	
	
	/* if(mat<=55) {
		System.out.println("Dersten Kaldınız");
	}else{
		System.out.println("Geçtiniz");
	};
	if(fizik<=50) {
		System.out.println("Dersten Kaldınız");
	}else {
		System.out.println("Geçtiniz");
		
	}
	
	if(kimya<=50) {
		System.out.println("Dersten Kaldınız");
	}else {
		System.out.println("Geçtiniz");
		
	}
	if(muzik<=50) {
		System.out.println("Dersten Kaldınız");
	}else {
		System.out.println("Geçtiniz");
		
	}
	if(tarih<=50) {
		System.out.println("Dersten Kaldınız");
	}else {
		System.out.println("Geçtiniz");
		
	}
	if(turkce<=50) {
		System.out.println("Dersten Kaldınız");
	}else {
		System.out.println("Geçtiniz");
		
	}*/
	// İF ELSE KULLANMADAN DERSİ GEÇME VE KALMA BULMA
	
	boolean ders = (mat >= 50) ||(fizik >= 50)|| (turkce >=50)|| (tarih >=50)|| (muzik >=50)||(kimya >=50);
	String cvp = mat >= 50 ? "Matematik Dersinden Geçtiniz" : "Matematik Dersinden Kaldınız";
	System.out.println(cvp);
	
	String cvp1 = fizik >= 50 ? "Fizik Dersinden Geçtiniz" : " Fizik Dersinden Kaldınız";
	System.out.println(cvp1);
	
	String cvp2 = turkce >= 50 ? "Türkçe Dersinden Geçtiniz" : "Türkçe Dersinden Kaldınız";
	System.out.println(cvp2);
	
	String cvp3 = tarih >= 50 ? "Tarih Dersinden Geçtiniz" : "Tarih Dersinden Kaldınız";
	System.out.println(cvp3);
	
	String cvp4 = muzik >= 50 ? "Müzik Dersinden Geçtiniz" : "Müzik Dersinden Kaldınız";
	System.out.println(cvp4);
	
	String cvp5 = kimya >= 50 ? "Kimya Dersinden Geçtiniz" : "Kimya Dersinden Kaldınız";
	System.out.println(cvp5);
	
	
	

	
	int toplam= (mat+fizik+kimya+turkce+tarih+muzik);
	int sonuc = toplam /6;
	System.out.println("ortalama :"+" "+sonuc);
	
	}

}
