package reCapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 1.5, 2.5, 3.6 };

		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			
		}
		System.out.println(max);
	}

}
