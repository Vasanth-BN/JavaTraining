package vasanth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class YazhiniTcs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		List <Integer> list=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(stock(list,n,k));
		
		
		sc.close();

	}
	public  static int stock(List<Integer> list,int n,int k) {
		List<Integer> li=new ArrayList<>();
		int t=n/2;
		int max,min;
		while(t>0) {
			max=Collections.max(list);
			min=Collections.min(list);
			
			
			li.add(max-k);
			li.add(min+k);
			t--;
		}
		if(n%2!=0)
		li.add(list.get(n/2));
		max=Collections.max(li);
		min=Collections.min(li);
		System.out.println(li);
		return max-min;
	}

}
