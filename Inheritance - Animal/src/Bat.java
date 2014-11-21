
public class Bat extends Mammal
	{
	public Bat()
		{
		name = "bat";
		food = "insects";
		myFlightBehavior= (FlightBehavior) new CanFly();
		}

	@Override
	public void makesNoise()
		{
		System.out.println("The " + name +  " emits an ultrasonic pulse.");
		}
	}
	
