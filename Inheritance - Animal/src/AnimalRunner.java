
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
		
		wolf.makesNoise();
		wolf.reactsToMan();
		
		dog.makesNoise();
		dog.reactsToMan();
		}
	}
