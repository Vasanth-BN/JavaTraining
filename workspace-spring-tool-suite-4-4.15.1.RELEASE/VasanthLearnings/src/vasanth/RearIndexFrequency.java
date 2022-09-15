package vasanth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RearIndexFrequency {
	public static void main(String...arg) {
		List <Integer> ab=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		for(int i=0;i<input1;i++) {
			ab.add(sc.nextInt());
		}
		sc.close();
		int flag=0;
		for(int i=ab.size()-1;i>=0;i--) {
			int a=ab.get(i);
			if(a<0) {
				ab.remove(i);
			}
			if(Collections.frequency(ab,a)>1 && a>0 && flag==0) {
				flag=1;
				System.out.println(ab.get(i));
			}
		}
		if(flag==0 && ab.size()==0) {
			System.out.println("0");
		}
		else {
			System.out.println(ab.get(input1-1));
		}
	}
}
