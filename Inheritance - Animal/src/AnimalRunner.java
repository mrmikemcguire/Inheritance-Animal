
public class AnimalRunner
	{
	public static void main(String[] args)
		{
		Animal [] animal = new Animal [4];
		animal[0] = new Bat();
		animal[1] = new Cow();
		animal[2] = new Penguin();
		animal[3] = new Robin();
		
		for (Animal a : animal)
			{	
			a.bearsYoung();
			a.makesNoise();
			a.eats();
			a.myFlightBehavior.flies();
			System.out.println();
			}
		}
	}
