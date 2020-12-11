import java.util.*;

public class SwapNum {
	public static void main(String args[]) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a:");
		a=sc.nextInt();
		System.out.println("enter value of b:");
		b=sc.nextInt();
		
		System.out.println("before swapping -a: "+ a +",b:" + b );
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("before swapping -a: "+ a +",b:" + b );
		
	}
}
