
public class BottleTester {
	public static void main(String args[]) {
		
		Bottle prestigebottle = new Bottle();
		prestigebottle.material = "steel";
		prestigebottle.shape = "Rectangle";
		prestigebottle.heightInInches = 5.2;
		
		prestigebottle.fillwater();
		Bottle miltonbottle = new Bottle();
		miltonbottle.material = "plastic";
		miltonbottle.shape = "Square";
		miltonbottle.heightInInches = 5.3;
		
	}
}
