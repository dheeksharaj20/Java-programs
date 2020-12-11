
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		Pyramid ref = new Pyramid();
		int pyramid =  ref.pyramid(num);
	}
	
	int pyramid(int num) {
		//TODO Auto-generated ethod stub
		int result = 0;
		for (int i=1;i<num;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return result;
	}
}
