import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {

	public static void main(String[] args) {
		double m, kg, kitleEndeks;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
		m = scan.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz :");
		kg = scan.nextDouble();
		
		kitleEndeks = kg/(m*m);
		
		System.out.println("Vücut Kitle İndeksiniz :" + kitleEndeks);
		
		
		
	}

}
