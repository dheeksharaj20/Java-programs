
public class PrimeNumber {
	public static void main(String args[]) {
		int n=7,m=0,flag=0,i;
		m=n/2;
		if(n==0 || n==1) {
			System.out.println(n + "is not prime number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0) {
					System.out.println(n + " is not a prime number");
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(n + "is prime number ");
			}
		}
	}
}
