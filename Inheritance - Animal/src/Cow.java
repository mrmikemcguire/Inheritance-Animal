
public class Cow extends Mammal
	{
	protected Cow()
		{
		name = "cow";
		food = "grass";
		sound = "moo";
		myFlightBehavior = (FlightBehavior) new CannotFly();
		}
	}
