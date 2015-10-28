
public class Robin extends Bird
	{
	public Robin()
		{
		name = "robin";
		food = "worms";
		sound = "chirp";
		myFlightBehavior = (FlightBehavior) new CanFly();
		}

	@Override
	public void makesNoise()
		{
		System.out.println("The " + name + " says, \"Chirp.\"");
		}

	}
