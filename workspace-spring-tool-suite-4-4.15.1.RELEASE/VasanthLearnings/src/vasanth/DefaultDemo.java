package vasanth;

interface Abcd {
	void abc();

	default void show() {
		System.out.println("Hi");
	}
}

class Aimp implements Abcd {
	public void abc() {
		System.out.println("Dumb");
	}
}

public class DefaultDemo {
	public static void main(String[] jawa) {
		Abcd obj = new Aimp();
		obj.show();
		obj.abc();
	}
}
