
public class FindingIfNoIsEven {
	public static void main(String args[]) {    // calling method
		//main ->JVM
		System.out.println("program to even or not\n");
		
		int num1 = 20;
		findingEven(num1);
		
		int num2 = 65;
		findingEven(num2);
		
		int num3 = 84;
		findingEven(num3);
		
		System.out.println("End of the prog \n");
	}
	static void findingEven(int num) {
		System.out.println("method is called \n");
		
		if(num % 2 == 0) {
			System.out.println(num + " is even \n");
		} 
		else
		{
			System.out.println(num + "is odd \n");
		}
		System.out.println("method is executing \n ");
	}
}
