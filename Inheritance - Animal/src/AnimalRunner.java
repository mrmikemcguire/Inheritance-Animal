
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
		}
	}
