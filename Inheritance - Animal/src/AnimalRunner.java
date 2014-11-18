
public class AnimalRunner
	{
	public static void main(String[] args)
		{
		Animal [] animals = new Animal [2];
		animals[0] = new Bat();
		animals[1] = new Cow();
		
		for (int i = 0; i < animals.length; i++)
			{			
			animals[i].makesNoise();
			}
		}
	}
