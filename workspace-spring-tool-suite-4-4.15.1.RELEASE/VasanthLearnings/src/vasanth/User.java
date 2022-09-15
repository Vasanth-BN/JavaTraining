package vasanth;
abstract class Humans{
	abstract void eat();
    void sleep() {
		System.out.println("Good night");
	}
}
class Man extends Humans {
	public void eat() {
		
		System.out.println("Non-veg");
	}
	public void sleep()
	{
		System.out.println("jjj");
		super.sleep();
	}
}
class Woman extends Humans{
	public void eat() {
		System.out.println("Veg");
	}
}
class Eat{
	public void eatSomething(Humans i) {
		i.eat();
	}
}
public class User{
	public static void main(String...args) {
		Eat food=new Eat();
		Humans vasa=new Man();
		food.eatSomething(vasa);
		Humans sathya=new Woman();
		food.eatSomething(sathya);
		vasa.sleep();
		
	}
}
