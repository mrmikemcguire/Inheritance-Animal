
public class Bat extends Mammal implements Flyable
	{
	name = "bat";
	food = "insects";

	@Override
	public void makesNoise()
		{
		System.out.println("The " + name +  "emits an ultrasonic pulse.");
		}
	}
	
