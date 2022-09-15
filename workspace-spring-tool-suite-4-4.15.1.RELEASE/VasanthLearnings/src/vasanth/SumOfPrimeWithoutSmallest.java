package vasanth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfPrimeWithoutSmallest {
	static List<Integer> li = new ArrayList<>();

	public static int in() {
		Scanner sc = new Scanner(System.in);

		int inp1 = sc.nextInt();
		int t = inp1;
		while (t > 0) {
			li.add(sc.nextInt());
			t--;
		}
		sc.close();
		return li.size();
	}

	public static int sum() {
		if (li.size() < 1) {
			throw new IndexOutOfBoundsException("List cannot be empty bro");
		} else {
			List<Integer> resLi = new ArrayList<>();
			for (int i : li) {
				if (isPrime(i)) {
					resLi.add(i);
				}
			}
			int sum = 0;
			// Collections.sort(resLi);
			if (resLi.size() > 0) {
				for (int i = 1; i < resLi.size(); i++) {
					sum += resLi.get(i);
				}
			} else {
				for (int i = 1; i < li.size(); i++) {
					sum += li.get(i);
				}
			}
			return sum;
		}
//		resLi.stream()
//		.sorted()
//		.skip(1)
//		.forEach(x->System.out.println(x));
	}

	public static boolean isPrime(int n) {
		boolean flag = false;
		int count = 0;
		if (n % 2 != 0 && n >= 2) {
			int sqr = (int) Math.sqrt(n);
			for (int i = 1; i <= sqr; i++) {
				if (n % i == 0)
					count++;
			}
			if (count == 1) {
				flag = true;
			}
		}
		return flag;
	}
}
