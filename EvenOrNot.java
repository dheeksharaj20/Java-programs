
public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		EvenOrNot ref = new EvenOrNot();
		int result= ref.evenOrNot(num);
		

	}
	int evenOrNot (int num) {
		int result = 0;
		if(num%2==0)
		{
			System.out.println("the given numnber is even" +num);
		}
		else
		{
			System.out.println("the given number is odd" +num);
		}
		return result;
	}

}
