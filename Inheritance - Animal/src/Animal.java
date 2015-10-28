
public abstract class Animal
	{
	protected String name;
	protected String food;
	protected String sound;
	protected FlightBehavior myFlightBehavior;

	public abstract void bearsYoung();

	public void eats()
		{
		System.out.println("The " + name + " is looking forward to eating some " + food + ".");
		}
	
	public void makesNoise()
		{
		System.out.println("The " + name +  " says " + sound);
		}
	}
