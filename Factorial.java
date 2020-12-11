
public class Factorial {
	public static void main (String args[]) {
		System.out.println("to print an factorial number");
		int number = 5;
		long fact = 1;
		for(int i=1; i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of number is:" +fact);
	}
}
