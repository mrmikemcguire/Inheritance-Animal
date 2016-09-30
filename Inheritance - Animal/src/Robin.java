
public class Robin extends Bird
	{
	public Robin()
		{
		name = "robin";
		food = "worms";
		sound = "chirp";
		myFlightBehavior = (FlightBehavior) new CanFly();
		}
	}
