
public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "penguin";
		food = "fish";
		}

	@Override
	public void makesNoise()
		{
		System.out.println("The " + name + " says, \"Brrr....\"");
		}

	@Override
	public void flies()
		{
		}
	}
