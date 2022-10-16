
public class Main {

	public static void main(String[] args) {
		/*
		 * int number = 2; int remainder = number % 2; System.out.println(remainder);
		 * 
		 * boolean isPrime = true;
		 * 
		 * if(number<1) { System.out.println("Geçersiz Sayı"); } if(number == 1) {
		 * System.out.println("Asal Sayı Degildir"); return; }
		 * 
		 * for (int i = 2; i < number; i++) {
		 * 
		 * if(number % i == 0) { isPrime = false;
		 * 
		 * }
		 * 
		 * 
		 * } if(isPrime) { System.out.println("Sayi Asal"); }else {
		 * System.out.println("Sayi Asal Değil"); }
		 */
		double number = 2.1;
		
		boolean isPrime = true;
		
		
		
		if(number==0) {
			System.out.println("Sayı Asal Değildir");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz Sayı");
			return;
		}
		
		for(int i =2; i < number; i++) {
			if(number % i ==0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("Sayı Asal sayı");
			
		}else {
			System.out.println("Sayı Asal Değil");
		}
		
		
	}

}
