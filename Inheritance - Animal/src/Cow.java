
public class Cow extends Mammal
	{
	public Cow()
		{
		name = "cow";
		food = "grass";
		}

	@Override
	public void makesNoise()
		{
		System.out.println("The " + name + " says, \"Moo.\"");
		}

	@Override
	public void flies()
		{
		}
	}
