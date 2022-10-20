package youTubeExample;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 200;
		System.out.println(sayi1);
		
		int[] sayilar = new int[] {1,2,3,4};
		int[] sayilar2 = new int[] {5,6,7,8};  
		sayilar=sayilar2;
		sayilar2[0]=1000;
		System.out.println(sayilar[0]); 
		
	}

}
