
public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "penguin";
		food = "fish";
		myFlightBehavior = (FlightBehavior) new CannotFly();
		}

	@Override
	public void makesNoise()
		{
		System.out.println("The " + name + " says, \"Brrr....\"");
		}
	}
