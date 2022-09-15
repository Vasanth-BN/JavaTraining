package vasanth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {
	public static String palindrome(String a) {
		String b = "";
		if (a.length() > 1) {
			for (int i = a.length() - 1; i >= 0; i--) {
				b += String.valueOf(a.charAt(i));
			}
			if (a.equals(b)) {
				return b;
			}
			else return "0";
		} 
		else
			return "0";
	}

	public static void main(String... args) {
		Scanner sc=new Scanner(System.in);
		
		String s = sc.nextLine();
		ArrayList<String> li = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			String a1 = s.substring(0, i);
			String a2 = s.substring(i);
			if (!palindrome(a1).equals("0")) {
				li.add(a1);
			}
			if (!palindrome(a2).equals("0")) {
				li.add(a2);
			}
		}
		int max;
		String maxS = li.get(0);
		String minS = String.valueOf(s.charAt(0));
		max = li.get(0).length();
		for (int i = 1; i < li.size(); i++) {

			if (li.get(i).length() >=max) {
				maxS = li.get(i);
			}
		}
		String arr[]=new String[2];
		arr[0]=maxS;
		arr[1]=minS;
		System.out.println(Arrays.toString(arr));
		sc.close();
//		System.out.println("Max Palindrome :" + maxS);
//		System.out.println("Min Palindrome :" + minS);
	}

}
