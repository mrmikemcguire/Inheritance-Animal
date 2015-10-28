
public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "penguin";
		food = "fish";
		myFlightBehavior = (FlightBehavior) new CannotFly();
		}
	}
