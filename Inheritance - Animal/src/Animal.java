
abstract class Animal
	{
	protected String name;
	protected String food;
	protected String sound;
	protected FlightBehavior myFlightBehavior;

	protected abstract void bearsYoung();

	protected void eats()
		{
		System.out.println("The " + name + " is looking forward to eating some " + food + ".");
		}
	
	protected void makesNoise()
		{
		System.out.println("The " + name +  " says " + sound + ".");
		}
	}
