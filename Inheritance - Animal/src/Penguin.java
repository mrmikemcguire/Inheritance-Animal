
public class Penguin extends Bird
	{
	protected Penguin()
		{
		name = "penguin";
		food = "fish";
		sound = "brrr";
		myFlightBehavior = (FlightBehavior) new CannotFly();
		}
	}
