
public class Penquin extends Bird
	{
	public Penquin()
		{
		name = "penquin";
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
