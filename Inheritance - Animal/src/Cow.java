
public class Cow extends Mammal
	{
	public Cow()
		{
		name = "cow";
		food = "grass";
		sound = "moo";
		myFlightBehavior = (FlightBehavior) new CannotFly();
		}
	}
