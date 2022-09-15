package vasanth;

import java.util.Scanner;
class Area{
	public static int area(int x) {
		return x*x;
	}
	
	public static double area(double y) {
		final double PI=3.14;
		return PI*(y*y);
	}
	
	public static int area(int x,int y) {
		return x*y;
	}
	
}

public class YazhiniTcs1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x= scanner.nextInt();
		
		scanner.nextLine();
		
		int y=scanner.nextInt();
		scanner.nextLine();
		
		double z=scanner.nextDouble();
		scanner.nextLine();
		
		int areaOfSquare=Area.area(x);
		double areaOfCircle=Area.area(z);
		int areaOfRectangle=Area.area(x,y);
		
		System.out.println("Area of Circle : "+areaOfCircle);
		System.out.println("Area of Square : "+areaOfSquare);
		System.out.println("Area of Rectangle : "+areaOfRectangle);
		
	}

}
