package zoo;

public class Hyena extends Animal{

	public Hyena(int inWeight, String inSound, String inType) {
		super(inWeight, inSound, inType);
	}
	
	@Override
		public void feed(String inFood) {
			if (super.likesFood(inFood)) 
			{
				System.out.println("Hyena just ate "+ inFood + "!! That is its favorite food!");
			} 
			else 
			{
				System.out.println("Hyena just ate "+ inFood + "!!  This animal eats anything you feed it!");
			}
		
			
	}
	
	@Override
	public String favoriteFood()
	{
		return "another Hyena";
	}
	
	public void biteFace()
	{
		System.out.println("The hyena just bit a nearby animal on the face!!!");
	}
}
