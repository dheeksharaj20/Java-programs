
public class SumOfNum {
	public static void main(String args[]) {
		System.out.println("to print an sum of numbers");
		{
			int n=123, sum=0, m;
			System.out.println("enter a number:" +n);
			while(n>0)
			{
				m=n%10;
				sum=sum+m;
				n=n/10;
			}
			System.out.println("prime sum value is:" +sum);
		}
	}
}
