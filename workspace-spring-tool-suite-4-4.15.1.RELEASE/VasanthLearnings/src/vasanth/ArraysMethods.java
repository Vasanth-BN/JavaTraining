package vasanth;

import java.util.*;

class Calc{
	public int add(int...n) {
		int sum=0;
		for(int i:n) {
			sum+=i;
			System.out.print(i+" + "+sum);
		}
		return sum;
	}
}

public class ArraysMethods {
	public static void main(String...arg) {
		Calc obj=new Calc();
		System.out.println(obj.add(4,5,6,7));
	}
}






//		int[] n= {1,2,3,8,8,3,8,3,2,7,0,5,1,4};
//		int[] arr=new int[10];
//		System.arraycopy(n,3,arr,0,10);
//		System.out.println(Arrays.toString(arr));
//		int a1[]= {1,2,3,4,5};
//		int [] a2= {2,3,3,4,5};
//		int[] a3= {2,3,4};
//		a[0]=a1;
//		a[1]=a2;
//		a[2]=a3;
//		for(int i[]:a) {
//			for(int j:i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}