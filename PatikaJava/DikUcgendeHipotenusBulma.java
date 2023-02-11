import java.util.Scanner;

public class DikUcgendeHipotenusBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//ÜÇGEN HİPOTENUS BULMA
		
		int a,b;
		double c;
		
		System.out.print("A kenar Uzunluğunu Giriniz :");
		a = scan.nextInt();
		System.out.print("B kenar Uzunluğunu Giriniz :");
		b = scan.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		
		System.out.println("Hipotenus :" + c);

	}

}
