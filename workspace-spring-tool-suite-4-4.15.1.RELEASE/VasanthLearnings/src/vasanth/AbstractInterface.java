package vasanth;

abstract class Human{
	public abstract void eat();
	public void walk(Integer i) {
		
	}
}
class Male extends Human{
	public void eat() {
		
	}
}
class Female extends Human{
	public void eat() {
		
	}
}

public class AbstractInterface {

	public static void main(String[] args) {
		Human ab=new Male();
	}

}
