
public class Penguin extends Bird
	{
	protected Penguin(String n, String f, String s)
		{
		name = n;
		food = f;
		sound = s;
		myFlightBehavior = (FlightBehavior) new CannotFly();
		}
	}
