
public class AnimalRunner
	{
	public static void main(String[] args)
		{
		Animal [] animals = new Animal [4];
		animals[0] = new Bat();
		animals[1] = new Cow();
		animals[2] = new Penquin();
		animals[3] = new Robin();
		
		for (int i = 0; i < animals.length; i++)
			{	
			animals[i].bearsYoung();
			animals[i].makesNoise();
			System.out.println();
			}
		}
	}
