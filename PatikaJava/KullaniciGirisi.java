import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		String userName = "patika", password = "java123" ;
		
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Kullanıcı Adınız :");
		userName = scan.nextLine();
		System.out.print("Sifrenizi Giriniz :");
		password = scan.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giris Yaptınız.");
		} else {
			System.out.print("Girilen Bilgiler Hatalı.\nYeni Şifre Oluşturmak İster misiniz?\n1-Evet\n2-Hayır\n");
			int select;
			select = scan.nextInt();

			switch (select) {
			case 1:
				System.out.println("Yeni Sifreyi Giriniz :");
				String newPassword = scan.nextLine();
				newPassword = scan.nextLine();
				
				if (newPassword.equals("java123")) {

					System.out.println("Yeni Şifre Eskisiyle Aynı olamaz. Baska Şifre Oluşturun.");
					
					
				} else {
					System.out.println("Şifre Oluşturuldu :"+newPassword);
				}
				break;	
			case 2:
				System.out.println("Giriş yapılamadı. İşlemler İptal edildi.");
				break;

			default:
				System.out.println("Geçersiz Seçim.");

			}

		}

	}

}
