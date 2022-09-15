package vasanth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String...arg) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		int limt=sc.nextInt();
		for(int i=0;i<limt;i++) {
			list.add(sc.nextInt());
		}
		// Method 1
		System.out.println("Using List ");
		
		for(int i=0;i<limt;i++) {
			if(Collections.frequency(list,list.get(i))>1) {
				list.remove(list.get(i));
				limt--;
				i--;
			}
		}
		// Method 2
		System.out.println(list+"\n\n Using Set ");
		
		Set<Integer> set=new HashSet<>();
		for(int i:list) {
			set.add(i);
		}
		System.out.println(set);
	sc.close();
	}
}
