
public class AnimalRunner
	{
	public static void main(String[] args)
		{
		Animal animal = new Animal();
		Canine canine = new Canine();
		Wolf wolf = new Wolf();
		Dog dog = new Dog();
		
		animal.makesNoise();
		animal.reactsToMan();
		
		canine.makesNoise();
		canine.reactsToMan();
		canine.displayAge();
		
		wolf.makesNoise();
		wolf.reactsToMan();
		wolf.displayAge();
		
		dog.makesNoise();
		dog.reactsToMan();
		dog.displayAge();
		
//		Animal [] animals = new Animal [2];
//		animals[0] = new Wolf();
//		animals[1] = new Dog();
//		
//		for (int i = 0; i < animals.length; i++)
//			{
//			animals[i].makesNoise();
//			}
		}
	}
