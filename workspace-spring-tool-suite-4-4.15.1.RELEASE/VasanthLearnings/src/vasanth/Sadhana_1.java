package vasanth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sadhana_1 {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		int actions=sc.nextInt();
		int pos=sc.nextInt();
		for(int i=0;i<actions;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			reverse(list,a,b);
		}
		int resPos=sc.nextInt();
		System.out.println(list.get(resPos));
		sc.close();
	}
	/* 10
	 * 2 2
	 * 1 5
	 * 6 10
	 * 1
	 */
	public static List<Integer> reverse(List<Integer> list, int a,int b) {
		
		
		
		
		
		return list;
	}
}
