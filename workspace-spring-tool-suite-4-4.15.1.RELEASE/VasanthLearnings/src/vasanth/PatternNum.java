package vasanth;

public class PatternNum {
	public static void main(String... ar) {
	//	Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* * ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("\n*");
			}
			System.out.println();
		}
	}
}
