import java.util.Scanner;

public class ManavKasaProgramı {

	public static void main(String[] args) {
	
		double armut,elma,domates,muz,patlıcan,armutKg=2.14,elmaKg=3.67,domatesKg=1.11,muzKg=0.95,patlıcanKg=5.00, toplam;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo :");
		armut = scan.nextDouble();
		System.out.print("Elma Kaç Kilo :");
		elma = scan.nextDouble();
		System.out.print("Domates Kaç Kilo :");
		domates = scan.nextDouble();
		System.out.print("Muz Kaç Kilo :");
		muz = scan.nextDouble();
		System.out.print("Patlıcan Kaç Kilo :");
		patlıcan = scan.nextDouble();
		
		toplam = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlıcan*patlıcanKg);
		
		System.out.print("Toplam Tutar :"+ toplam);
		
	}

}
