
public class GreaterNestedIfElse {
	public static void main(String args[]) {

		System.out.println("Program to find greatest number among three numbers using nested if else");

		int a = 10, b = 30, c = 20;

		if (a > b) {
			if (a > c) {
				System.out.println(" a is greater among 3");
			} else {

				System.out.println(" c is greater among 3");
			}
		} else {
			if (b > c) {

				System.out.println("b is greater among 3");
			} else {
				System.out.println(" c is greater among 3");
			}
		}

		System.out.println("End of Program");
	}
}
