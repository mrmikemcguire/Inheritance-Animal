
public class Bat extends Mammal
	{
	protected Bat()
		{
		name = "bat";
		food = "insects";
		myFlightBehavior= (FlightBehavior) new CanFly();
		}

	@Override
	protected void makesNoise()
		{
		System.out.println("The " + name +  " emits an ultrasonic pulse.");
		}
	}
	
