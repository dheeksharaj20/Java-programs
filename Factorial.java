
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6, i = 1, fact = 1;
		Factorial ref = new Factorial();
		int res = ref.factorial(num,i,fact);
	}
	int factorial(int num,int i,int fact) {
		int result=0;
		do {
			fact=fact*i;
			i++;
		}
		while(i<=num);
		{
			System.out.println("the factorial of num is" +fact);
		}
		return result;
	}

}
