
public class PosOrNegOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program to find the no. is pos neg or zero \n");

		int num1 = -20;
		findingPosNegZero(num1);

		int num2 = 10;
		findingPosNegZero(num2);

		int num3 = 0;
		findingPosNegZero(num3);

		System.out.println("end of the program");

	}

	static void findingPosNegZero(int num) {
		System.out.println("Method called\n");
		if (num > 0) {
			System.out.println("the given number " + num + "is positive \n");
		} else if (num < 0) {
			System.out.println("the given number " + num + "is negative\n ");
		} else {
			System.out.println("the given number is zero");
		}
		System.out.println("Method completed execution");
	}

}
