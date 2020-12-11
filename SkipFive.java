
public class SkipFive {
	public static void main(String args[]) {
		System.out.println("progm to illustrate while loop");
		// skip printing all the multiple of five
		int n =5 ,i=1;
		while(i<=50)
		{
			if(i % n == 0)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("end of the program");
	}
}
