package zoo;

public class Animal {
	
	private int weightKg;
	private String sound;
	private String type;
	
	public Animal(int inWeight, String inSound, String inType)
	{
		weightKg = inWeight;
		sound = inSound;
		type = inType;
		System.out.println("A new " + weightKg + "kg " + type + " has arrived!  " + sound);
	}
	
	public void feed(String inFood)
	{
		System.out.println("ERROR: Unknown Animal Type cannot feed");
	}

	public String favoriteFood()
	{
		return "ERROR: Unknown Animal Type does not have a favorite food";
	}
	
	public boolean likesFood(String inFood)
	{
		return (inFood.toString() == favoriteFood().toString());
	}
	
	public int getWeight()
	{
		return weightKg;
	}
		
	public String makeSound()
	{
		return sound;
	}
	
	@Override
	public String toString() {
		return type + " makes the sound " + makeSound() + " and weighs " + getWeight() + "kg and loves to eat " + favoriteFood() + ".";		
	}

}
