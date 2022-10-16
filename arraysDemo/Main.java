package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String[] students = new String[4];
		students[0]="Anıl";
		students[1]="Ali";
		students[2]="Veli";
		students[3]="King";
		
		for(int i = 0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("----------");
		
		////DİZİLERİN REELDE KULLANIM SEKLİİİİ
		for(String student:students) {
			System.out.println(student);
		}
	}

}
