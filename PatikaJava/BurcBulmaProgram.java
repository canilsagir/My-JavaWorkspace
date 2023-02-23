import java.util.Scanner;

public class BurcBulmaProgram {

	public static void main(String[] args) {
		int month, day;
		Scanner scan = new Scanner(System.in);

		System.out.print("Doğum Ayınızı Giriniz :");
		month = scan.nextInt();
		if (month >= 1 && month <= 12) {
		System.out.print("Doğum Gününüzü Giriniz :");
		day = scan.nextInt();

		
			if (month == 1) {
				if (day >= 1 && day <= 31) {
					if (day < 22) {
						System.out.println("Oğlak Burcusun");
					} else {
						System.out.println("Kova Burcusun");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");

				}

			}
			if (month == 2) {
				if (day >= 1 && day <= 28) {
					if (day < 20) {
						System.out.println("Kova Burcusunuz.");
					} else {
						System.out.println("Balık Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}

			}
			if (month == 3) {
				if (day >= 1 && day <= 31) {
					if (day < 20) {
						System.out.println("Balık Burcusunuz.");
					} else {
						System.out.println("Koç Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}

			}
			if (month == 4) {
				if (day >= 1 && day <= 30) {
					if (day < 20) {
						System.out.println("Koç Burcusunuz.");
					} else {
						System.out.println("Boğa Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}

			}
			if (month == 5) {
				if (day >= 1 && day <= 31) {
					if (day < 22) {
						System.out.println("Boğa Burcusunuz.");
					} else {
						System.out.println("İkizler Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}

			}
			if (month == 6) {
				if (day >= 1 && day <= 30) {
					if (day < 23) {
						System.out.println("İkizler Burcusunuz.");
					} else {
						System.out.println("Yengeç Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}

			}
			if (month == 7) {
				if (day >= 1 && day <= 31) {
					if (day < 23) {
						System.out.println("Yengeç Burcusunuz.");
					} else {
						System.out.println("Aslan Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}

			}
			if (month == 8) {
				if (day >= 1 && day <= 31) {
					if (day < 23) {
						System.out.println("Aslan Burcusunuz.");
					} else {
						System.out.println("Başak Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}

			}
			if (month == 9) {
				if (day >= 1 && day <= 30) {
					if (day < 23) {
						System.out.println("Başak Burcusunuz.");
					} else {
						System.out.println("Terazi Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}

			}
			if (month == 10) {
				if (day >= 1 && day <= 31) {
					if (day < 22) {
						System.out.println("Terazi Burcusunuz.");
					} else {
						System.out.println("Akrep Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}
			}
			if (month == 11) {
				if (day >= 1 && day <= 31) {
					if (day < 22) {
						System.out.println("Akrep Burcusunuz.");
					} else {
						System.out.println("Yay Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}
			}
			if (month == 12) {
				if (day >= 1 && day <= 31) {
					if (day < 22) {
						System.out.println("Yay Burcusunuz.");
					} else {
						System.out.println("Oğlak Burcusunuz.");
					}

				} else {
					System.out.println("Geçersiz Gün Girdiniz.");
				}
			}
		}else {
			System.out.println("Geçersiz Ay Girdiniz.");
		}
	}

}
