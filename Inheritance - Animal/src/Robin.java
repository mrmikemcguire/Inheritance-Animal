
public class Robin extends Bird implements Flyable
	{
	public Robin()
		{
		name = "robin";
		food = "worms";
		}

	@Override
	public void makesNoise()
		{
		System.out.println("The " + name + " says, \"Chirp.\"");
		}
	
	@Override
	public void flies()
		{
		System.out.println("The " + name + " can also fly!");
		}
	}
