
public abstract class Animal
	{
	protected String food;
	protected String name;
		
	public abstract void makesNoise();
	public abstract void bearsYoung();
	public abstract void flies();

	public void eats()
		{
		System.out.println("The " + name + " is looking forward to eating some " + food + ".");
		}
	}
