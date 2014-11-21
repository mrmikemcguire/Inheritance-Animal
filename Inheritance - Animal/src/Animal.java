
public abstract class Animal
	{
	protected String name;
	protected String food;
	protected FlightBehavior myFlightBehavior;

	public abstract void makesNoise();
	public abstract void bearsYoung();

	public void eats()
		{
		System.out.println("The " + name + " is looking forward to eating some " + food + ".");
		}
	}
