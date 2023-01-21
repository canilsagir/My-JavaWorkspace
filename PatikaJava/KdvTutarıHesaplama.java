import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class KdvTutarıHesaplama {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// DERSTE GÖSTERİLEN
		
		/*double tutar, kdvOran = 0.18, kdvTutar, kdvliToplamTutar;
		System.out.println("Ücret Tutarını giriniz :");

		tutar = scan.nextDouble();
		kdvTutar = tutar * kdvOran;
		System.out.println(kdvTutar);
		kdvliToplamTutar = kdvTutar + tutar;
		System.out.println(kdvliToplamTutar);*/
		
		double tutar, kdvOran =0.18, kdvOran2=0.08, kdvTutar, kdvliToplamTutar, yeniTutar;
		System.out.print("Ücret Tutarını Giriniz :");
		tutar = scan.nextDouble();
		
		//-----------------1. ACIKLAMALI YAPILISI---------------
		
		/*if(tutar == 0 || tutar <1000) {
			kdvTutar = tutar*kdvOran;
			System.out.println("KDV Tutarı :" +kdvTutar);
			kdvliToplamTutar = kdvTutar+tutar;
			System.out.println("KDV'li Toplam Tutar :" + kdvliToplamTutar);
			
		}else if (tutar >=1000){
			kdvTutar = tutar*kdvOran2;
			System.out.println("KDV Tutarı :"+kdvTutar);
			
			kdvliToplamTutar = kdvTutar+tutar;
			System.out.println("KDV'li Toplam Tutar :" + kdvliToplamTutar);
			
		}*/
		
		//--------------- 2. KISA YAPILISI-----------------
		
		if(tutar >= 1000) {
			kdvTutar = tutar * kdvOran2;
			
		}else {
			kdvTutar =tutar *kdvOran;
		}
		 
		yeniTutar = kdvTutar + tutar;
		System.out.println("KDV'li Toplam Tutar :"+ yeniTutar);
		
				
		
	}

}
