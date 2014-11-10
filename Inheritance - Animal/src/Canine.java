
public class Canine extends Animal
	{
	@Override
	public void makesNoise()
		{
		System.out.println("A canine yips...");
		}
	
	@Override
	public void reactsToMan()
		{
		System.out.println("A canine reacts to man...");
		}
	
	public void displayAge()
		{
		age = 10;
		System.out.println(name + " is " + age + " years old.");
		}
	}
