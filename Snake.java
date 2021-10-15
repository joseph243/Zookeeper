package zoo;

public class Snake extends Animal {

	public Snake(int inWeight, String inSound, String inType) {
		super(inWeight, inSound, inType);
	}

	@Override
	public void feed(String inFood) {
		if (super.likesFood(inFood)) 
		{
			System.out.println("Snake just swallowed an egg");
		} 
		else 
		{
			System.out.println("Snake just vomited");
		}
	}

	@Override
	public String favoriteFood() {
		return "egg";
	}
}
