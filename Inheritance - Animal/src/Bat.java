
public class Bat extends Mammal
	{
	protected Bat(String n, String f, String s)
		{
		name = n;
		food = f;
		sound = s;
		myFlightBehavior= (FlightBehavior) new CanFly();
		}

	@Override
	protected void makesNoise()
		{
		System.out.println(name +  " emits an ultrasonic pulse.");
		}
	}
	
