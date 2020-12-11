
public class BallTester {
	public static void main(String args[]) {
		Ball football = new Ball();
		football.color = "yellow";
		football.size = "big";
		football.weight = 2;
		System.out.println("Details of the football \n");
		System.out.println("color of the football: " +football.color);
		System.out.println("size of the football: " +football.size);
		System.out.println("weight of the football: " +football.weight);
		
		Ball basketball = new Ball();
		basketball.color = "brown";
		basketball.size = "big";
		basketball.weight = 3;
		System.out.println("Details of the basketball \n");
		System.out.println("color of the basketball: " +basketball.color);
		System.out.println("size of the basketball: " +basketball.size);
		System.out.println("weight of the basketball: " +basketball.weight);
		
	}
}
