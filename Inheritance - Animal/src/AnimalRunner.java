import java.util.ArrayList;

public class AnimalRunner
	{
	public static void main(String[] args)
		{
//		Animal [] animal = new Animal [4];
//		animal[0] = new Bat();
//		animal[1] = new Cow();
//		animal[2] = new Penguin();
//		animal[3] = new Robin();
		
		ArrayList <Animal> zoo = new ArrayList <Animal>();
		zoo.add(new Bat("Fang", "insects", "ultrasonic pulse"));
		zoo.add(new Cow("Flossy", "grass", "moo"));
		zoo.add(new Penguin("Cody", "fish", "brr"));
		zoo.add(new Robin("Christopher", "worms", "chirp"));

		for (Animal a : zoo)
			{	
			a.bearsYoung();
			a.makesNoise();
			a.eats();
			a.myFlightBehavior.flies();
			System.out.println();
			}
		}
	}
