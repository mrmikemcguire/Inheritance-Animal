
public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "penguin";
		food = "fish";
		sound = "brrr";
		myFlightBehavior = (FlightBehavior) new CannotFly();
		}
	}
