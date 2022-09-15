package vasanth;

//class Outer{
//	public void show() {
//		System.out.println("Im Big show");
//	}
//	 class Inner{
//		void show() {
//			System.out.println("Im John cena");
//		}
//	}
//}




public class InnerClass {
	public static void main(String...arg) {
//		Outer s=new Outer();
//		s.show();
//		Outer.Inner s1=s.new Inner();
//		s1.show();
		Vasa_.display();
	    Vasa_.Jawa.display();
	}
}

class Vasa_{
	public static void display() {
		System.out.println("Outer display buddy");
	}
	class Jawa{
		public static void display() {
			System.out.println("Inner display buddy!");
		}
	}
}