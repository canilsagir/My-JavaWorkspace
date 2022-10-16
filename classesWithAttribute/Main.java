package classesWithAttribute;

import java.security.Identity;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Huavei", 5000, 10, "Telefon");
		
		//Overloading olarak set ederekte kullanılabilir yukarıdaki gibide kullanılabilir.
		product.setName("Huavei Z");
		product.setId(1);
		product.setPrice(5000);
		product.setStockAmount(10);
		product.setDescription("Telefon ");
		product.getKod();
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
	}

}
