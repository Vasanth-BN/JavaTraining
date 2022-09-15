package vasanth;

import java.util.ArrayList;

public class AlternativePrimes {
	public static boolean isPrime(int n) {
		int count=0;
		if(n%2!=0) {
			int sqr=(int)Math.sqrt(n);
			for(int i=3;i<=sqr;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==0) {
				return true;
			}
			else return false;
		}
		return false;
	}
	public static void main(String...arg) {
		int n=11;
		ArrayList <Integer> res=new ArrayList<>();
		for(int i=n;i<70;i++) {
			if(isPrime(i)==true) {
				res.add(i);
			}
		}
//		res.forEach(System.out::println);
		for(int i=0;i<res.size();i+=2) {
			System.out.println(+res.get(i));
		}
	}
}
