package vasanth;

import java.util.Arrays;

public class SpiralPattern {
	public static void main(String...arg) {
//		int R=sc.nextInt();
//		int L=sc.nextInt();
		final int r=3;
		final int c=3;
		int n=r*c;
		int a,b,k=1;
		int[][]arr=new int[r][c];
		int []ar=new int[r*c];
		for(int i=0;i<r*c;i++) {
			ar[i]=k++;
		}
		System.out.println(Arrays.toString(ar));
		a=r/2;
		b=(c-1)/2;
		arr[a][b]=n;
		for(int i=n-1;i>=0;i--) {
			if(b>=0) {
				
			}
		}
	}
}

