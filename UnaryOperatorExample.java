
public class UnaryOperatorExample {
	public static void main(String args[]) {

		// Pre Increment
		int a = 10;
		int preIncNum = ++a;
		System.out.println("The value is :" + preIncNum);
		System.out.println("The value of a is :" + a);

		// Post Increment
		int b = 10;
		int postIncNum = b++;
		System.out.println("The value is :" + postIncNum);
		System.out.println("The value of b is :" + b);

		// Pre Decrement
		int c = 10;
		int preDecNum = --c;
		System.out.println("The value is :" + preDecNum);
		System.out.println("The value of c is :" + c);

		// Post Decrement
		int d = 10;
		int postDecNum = d--;
		System.out.println("The value is :" + postDecNum);
		System.out.println("The value of d is :" + d);

		// Logical NOT Operator
		boolean flag = true;
		System.out.println("The flag value is :" + !flag);
		boolean flags = false;
		System.out.println("The flag value is :" + !flags);

		int i = 10, j = 5, k = 10;
		int res = i++ - --j + ++k - i--;
		System.out.println("The result is :" + res);

	}

}
