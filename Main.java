package zoo;
public class Main {
	
	public static void main(String[] args) {
		Catfish sam = new Catfish(3, "bloop", "Catfish");
		Hyena frank = new Hyena(15, "arghlrhgssrgrhgrshr", "Hyena");
		Snake slimy = new Snake(5, "ssssssss", "Snake");    
//		Animal generic = new Animal(1, "animal sound", "genericanmilal");
		System.out.println("=============================================================================");
		Animal[] zoo = {sam,frank,slimy};
		for (Animal animal:zoo)
		{
			System.out.println(animal);
			animal.feed(animal.favoriteFood());
			System.out.println("=============================================================================");
		}
		System.out.println("=============================================================================");
		frank.biteFace();
		frank.biteFace();
		frank.feed("a rusty butterknife");
		sam.feed("pizza");
	}
}
