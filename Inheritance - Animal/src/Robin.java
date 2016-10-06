
public class Robin extends Bird
	{
	protected Robin()
		{
		name = "robin";
		food = "worms";
		sound = "chirp";
		myFlightBehavior = (FlightBehavior) new CanFly();
		}
	}
