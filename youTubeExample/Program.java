package youTubeExample;

//import java.awt.image.BaseMultiResolutionImage;
import java.lang.reflect.Constructor;

//import javax.smartcardio.CommandAPDU;

public class Program {

	public static void main(String[] args) {
		/*
		 * CreditManager creditManager = new CreditManager(); creditManager.Calculate();
		 * creditManager.Save();
		 * 
		 * Customer customer= new Customer(); customer.id=1; customer.city="Ankara";
		 * 
		 * System.out.println(customer.id +" "+ customer.city);
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.save(); customerManager.delete();
		 * 
		 * //INHERITANCE Example
		 * 
		 * BaseCreditManager baseCreditManager = new BaseCreditManager();
		 * baseCreditManager.hesapla(); System.out.println(baseCreditManager);
		 * 
		 * 
		 * 
		 * //Inheritance var ise referans tip dolayısıyla Police ve WorkCredit
		 * new'lenebilir. BaseCreditManager example1 = new PoliceCreditManager();
		 * BaseCreditManager example2 = new WorkCreditManager();
		 * 
		 * //Inheritance Example2
		 * 
		 * Company company = new Company(); company.taxNumber="123123"; company.id=100;
		 * Person person = new Person(); person.nationalIdentity="1231255";
		 * person.firstName="ANIL"; person.lastName="Sağır";
		 * 
		 * //INHERİTANCE Example... CustomerManager customerManager2=new
		 * CustomerManager(new Person());
		 */
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.GiveCredit();
	}

}
	class CreditManager {

		public void Calculate() {
		System.out.println("Hesaplandı");
	}

		public void Save() {

		System.out.println("Kredi Verildi.");

	}
}
	class Customer {
		
		public Customer() {
			System.out.println("Müşteri nesnesi başlatıldı.");
		}
		int id;	
		String city;
		
	}
	
	class CustomerManager{

		private Customer _customer;
		private ICreditManager _creditManager;
		//private ITrialManager _iTrialManager;
		
		public CustomerManager(Customer customer, ICreditManager creditManager){
			_customer = customer;
			_creditManager = creditManager; 
			//_iTrialManager = iTrialManager;
		}
		public void save( ) {
			System.out.println("Müşteri Kaydedildi."+ _customer.id);
		}
		public void delete( ) {
			System.out.println("Müşteri Silindi."+ _customer.city);
		}
		public void GiveCredit() {
			_creditManager.Calculate();
			System.out.println("Kredi Verildi.");
			
		}
	/*	public void GiftCredit() {
			_iTrialManager.Calculate();
			System.out.println("Hediye Krediniz Hazırlandı.");
		}*/
		
	
	}
	class Company extends Customer {
		String taxNumber;
		
	}	
	class Person extends Customer {
		String nationalIdentity;
		String firstName;
		String lastName;
		
	}	
	interface ICreditManager {
		
		void Calculate();
		void Save();
		
	}
	
	abstract class BaseeCreditManager implements ICreditManager {
		public abstract void Calculate();
		public void Save() {
			System.out.println("Kaydedildi.");
			
		}
	}
	/*interface ITrialManager{
		void Calculate();
		void Save();
	}*/
	
	class TeacherCreditManager extends BaseeCreditManager implements ICreditManager{

		@Override
		public void Calculate() {
			System.out.println("Öğretmen Kredisi Hesaplandı.");
			
		}

		
		
		
	}

	class MilitaryCreditManager extends BaseeCreditManager implements  ICreditManager {

		@Override
		public void Calculate() {
			System.out.println("Asker Kredisi Hesaplandı.");
			
		}

		
	
		
	}
	
	class DoctorCreditManager extends BaseeCreditManager implements ICreditManager {

		@Override
		public  void Calculate() {
			System.out.println("Doktorlar için kredi hesaplandı.");
			
		}

		@Override
		public void Save() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	