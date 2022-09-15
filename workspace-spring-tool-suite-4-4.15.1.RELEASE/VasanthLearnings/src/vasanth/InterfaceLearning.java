package vasanth;

interface Demo{
	int num=5;
	default void show() {
		int a=3;
		System.out.println(num+a);
	}
}

class DemoImp implements Demo{
	 
	  public void show() { 
		int a=num;
		Demo.super.show();
		System.out.println(++a);
	}
}

public class InterfaceLearning {
	public static void main(String...arg) {
		Demo obj = new DemoImp();
		obj.show();
	}
}
