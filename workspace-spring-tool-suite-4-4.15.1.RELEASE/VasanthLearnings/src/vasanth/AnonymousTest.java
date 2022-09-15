package vasanth;

class A {
	public void show() {
		System.out.println("In A show");
	}
}
interface B{
	void print();
}
public class AnonymousTest {

	public static void main(String[] args) {
		
		// Anonymous class for normal class ---->
		
		A a1 = new A() {
			public void show() {
				super.show(); 
				System.out.println("I'm the best");
			}
		};
		a1.show();
		
		// Anonymous class for Interface ----->
		
		B a2=new B() {
			public void print() {
				System.out.println("Printed");
			}
		};
		a2.print();   
	}

}
