package vasanth;

public class PatternsFish {
	public static void main(String...v)throws Exception {
		int n=5;
	//	throw new Exception("You are wrong");
		try {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*   ");
			}
			
			System.out.println();
		}
		for(int i=n+1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*   ");
			}
			
			System.out.println();
		}
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("\n\t\t Fish Pattern");
		}
	}
}
