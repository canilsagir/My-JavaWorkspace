package switchDemo;

public class Main {

	public static void main(String[] args) {

		char note = 'F';

		switch (note) {
		case 'A':
			System.out.println("Mükemmel :");
			break;
		case 'B':
			System.out.println("Orta yaptınız");
			break;
		case 'C':
			System.out.println("İyi Geçtiniz");
			break;
		case 'D':
			System.out.println("İyi Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

	}

}
