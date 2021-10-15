package zoo;

public class Catfish extends Animal{

	public Catfish(int inWeight, String inSound, String inType) {
		super(inWeight, inSound, inType);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void feed(String inFood) {
		if (super.likesFood(inFood)) 
		{
			System.out.println("Catfish just ate scum from the bottom of a lake");
		} 
		else 
		{
			System.out.println("Catfish just vomited");
		}
	}
	
	@Override
	public String favoriteFood()
	{
		return "scum from the bottom of a lake";
	}
}
