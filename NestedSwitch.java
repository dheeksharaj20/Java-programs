
public class NestedSwitch {
	public static void main(String args[])
	{
		System.out.println("enter the switch case");
		int x=1, y=2;
		switch(x)
		{
		case 1: System.out.println("print x is:" +x);
		break;
		default: System.out.println("error");
		break;
		}
		switch(y)
		{
		case 2:System.out.println("print y is:" +y);
		break;
		default: System.out.println("error");
		}
		System.out.println("end of switch case");
		
	}
}
