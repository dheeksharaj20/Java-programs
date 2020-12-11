
public class DoWhile {
	public static void main(String args[]) {
		System.out.println("to print an sum of nunbers");
		{
			int n=123,sum=0,m;
			System.out.println("enter a number:" +n);
			while(n>0)
			{
				m=n%10;
				sum=sum+m;
				n=n/10;
			}
			System.out.println("print sum values is:" +sum);
		}
	}
}
