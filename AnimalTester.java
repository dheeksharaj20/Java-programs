
public class AnimalTester {
	public static void main(String args[] ) {
		Animal frog = new Animal();
		frog.color ="green";
		frog.shape = "normal";
		frog.weight = 1;
		System.out.println(" details of frog");
		System.out.println("color of the frog:" +frog.color);
		System.out.println("shape of the frog:" +frog.shape);
		System.out.println("weight of the frog:" +frog.weight);
	
		Animal Elephant = new Animal();
		Elephant.color ="black";
		Elephant.shape = "huge";
		Elephant.weight = 150;
		System.out.println(" details of Elephant\n");
		System.out.println("color of the Elephant:" +Elephant.color);
		System.out.println("shape of the Elephant:" +Elephant.shape);
		System.out.println("weight of the Elephant:" +Elephant.weight);
		
	}
}
