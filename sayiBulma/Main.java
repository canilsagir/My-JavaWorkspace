package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,3,4,5,6};
		
		int aranacak = 5;
		
		boolean varMi = false;
		
		
	for(int sayi:sayilar) {
		if(aranacak == sayi) {
			varMi = true;
			break;
		}
		
	}if(varMi) {
		
		System.out.println("Bu sayı Var");
	}else {
		System.out.println("Bu sayı dizide yok");
	}
		
	}
		
	}


