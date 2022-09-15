package vasanth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PasswordTest {
	public static void main(String... arg) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Integer[] arr = new Integer[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(freqPass(arr));
	}

	public static String freqPass(Integer arr[]) {

		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		Collections.addAll(set, arr);
		Collections.addAll(li, arr);
		for (int a : set) {
			list.add(a);
		}
		String ans = "";
		int c = Collections.frequency(li, list.get(0));
		int max1 = list.get(0), max2 = 0;

		for (int i = 1; i < list.size(); i++) {
			int a = list.get(i);
			int freq = Collections.frequency(li, a);
			if (freq > c) {
				c = freq;
				max1 = a;
			}
		}
		ans += Integer.toString(max1);
		c = 1;
		label: for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != Integer.parseInt(ans)) {
				max2 = list.get(i);
				break label;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			int b = list.get(i);
			int freq = Collections.frequency(li, b);
			if (b != Integer.parseInt(ans) && freq > c) {
				c = freq;
				max2 = b;
			}
		}

		ans += Integer.toString(max2);

		return ans;
	}
}
