import java.util.Scanner;

public class DaireninAlanıVeCevresiHesaplama {

	public static void main(String[] args) {
		int r;
		double pi=3.14;
		Scanner scan = new Scanner(System.in);
		System.out.print("Yarıçap Giriniz :");
		r = scan.nextInt();
		
		double alan = pi*r*r;
		double cevre = 2*pi*r;
		System.out.println("Dairenin Alanı :" + alan);
		System.out.println("Dairenin Çevresi :"+cevre);

	}

}
