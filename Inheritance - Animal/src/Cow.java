
public class Cow extends Mammal
	{
	protected Cow(String n, String f, String s)
		{
		name = n;
		food = f;
		sound = s;
		myFlightBehavior = (FlightBehavior) new CannotFly();
		}
	}
