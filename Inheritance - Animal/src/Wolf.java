
public class Wolf extends Canine
	{
	@Override
	public void makesNoise()
		{
		System.out.println("A wolf howls...");
		}
	
	@Override
	public void reactsToMan()
		{
		System.out.println("A wolf eats man...");
		}
	
	@Override
	public void displayAge()
		{
		age = 3;
		System.out.println(name + " is " + age + " years old.");
		}
	}
	
