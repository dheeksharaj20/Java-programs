
public class SmallesNestedIfElse {
	public static void main(String[] args) {
		System.out.println("Program to find smallest among 3 numbers using nested if else condition \n");
		int a = 5, b = 10, c = 1;

		if (a < b) {
			if (c < a) {
				System.out.println(" c is the smallest among 3");
			} else {
				System.out.println(" a is the smallest among 3");
			}
		} else {
			if (b < c) {
				System.out.println(" b is the smallest among 3");
			} else {
				System.out.println(" c is the smallest among 3 \n");
			}
		}

		System.out.println("End of Program");
	}
}
