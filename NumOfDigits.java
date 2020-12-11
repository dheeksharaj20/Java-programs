
public class NumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program to find the number of digit \n");
		
		int num1 = -20;
		findingNumOfDigit(num1);

		int num2 = 10;
		findingNumOfDigit(num2);

		int num3 = 0;
		findingNumOfDigit(num3);

		System.out.println("end of the program");

	}

	static void findingNumOfDigit(int num) {
		System.out.println("Method called\n");
		
		int count = 0;
		do {
			num = num/10;
			count++;
		}
		while (num != 0);
		System.out.println("number of digit:" +count);
		
		System.out.println("method completed execution");
	}

}
