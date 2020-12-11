
public class DoWhileNum {
	 public static void main(String args[]) {
		 int num=456, count=0;
		 System.out.println("enter a number:" +num);
		 {
			 for(num=456; num!=0; num=num/10)
				 count++;
		 }
		 System.out.println("Total digit is: " +count);
	 }
}
