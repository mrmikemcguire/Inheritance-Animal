
public class Robin extends Bird
	{
	protected Robin(String n, String f, String s)
		{
		name = n;
		food = f;
		sound = s;
		myFlightBehavior = (FlightBehavior) new CanFly();
		}
	}
