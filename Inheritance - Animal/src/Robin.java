
public class Robin extends Bird implements Flyable
	{
	name = "robin";
	food = "worms";
	
	@Override
	public void makesNoise()
		{
		System.out.println("The " + name + " says, \"Chirp.\"");
		}
	}
