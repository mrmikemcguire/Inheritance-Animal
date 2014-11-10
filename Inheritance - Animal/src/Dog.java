
public class Dog extends Canine
	{

	@Override
	public void makesNoise()
		{
		name = "Fido";
		System.out.println(name + " barks...");
		}
	
	@Override
	public void reactsToMan()
		{
		System.out.println(name + " wants to play with man...");
		}
	
	public void displayAge()
		{
		age = 7;
		System.out.println(name + " is " + age + " years old.");
		}
	}