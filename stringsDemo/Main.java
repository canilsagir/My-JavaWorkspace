
public class Main {

	public static void main(String[] args) {
		///Stringlerle Çalışma
		String message = "Today Is Good.";
		/*
		 * System.out.println("Eleman Sayısı : " + message.length());
		 * System.out.println("5.Eleman = " + message.charAt(4));
		 * System.out.println(message.concat(" Realy"));
		 * System.out.println(message.startsWith("A"));
		 * System.out.println(message.endsWith("."));
		 * 
		 * ///GetChars kullanımı char[] karakterler = new char[5]; message.getChars(0,
		 * 5, karakterler, 0); System.out.println(karakterler);
		 * 
		 * ///İndexOf System.out.println(message.indexOf('y'));
		 * System.out.println(message.lastIndexOf('G'));
		 */
		///Replace yeni mesaj yaratmak
		System.out.println(message.replace(' ','-'));
		
		///Substring bulunan metinden kesme
		System.out.println(message.substring(2,4));
		
		///Split bosluga göre ayırma
		for(String word:message.split(" ")) {
			System.out.println(word);
		}
		///toLoverCase küçük harfe çevirme
		System.out.println(message.toLowerCase());
		///toUpperCase büyük harfe çevirme
		System.out.println(message.toUpperCase());
	}
}