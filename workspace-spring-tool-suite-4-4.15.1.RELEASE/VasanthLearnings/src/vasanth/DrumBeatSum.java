package vasanth;

import java.util.Arrays;
import java.util.Scanner;

public class DrumBeatSum {
	public static void main(String... arg) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] ar = new int[size];
		int[] ar1 = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = i + 1;
			ar1[i] = sc.nextInt();
		}
		// int[] ar= {1,2,3,4,5};
		// int[] ar1= {2,3,1,5,4};
		try {
			int[] res = new int[ar.length];
			System.arraycopy(ar, 0, res, 0, size);
			boolean flag = true;
			int count = 0, k;
			while (flag) {
				flag = true;
				drumsBeat(ar, ar1);
				count++;
				k = 0;
				for (int i = 0; i < ar.length; i++) {
					if (res[i] == ar[i]) {
						k++;
					}
				}
				if (k == ar.length) {
					System.out.println(count);
					break;
				}
				sc.close();
			}
		} catch (Exception e) {
			System.out.println("e");
		}

	}

	public static int[] drumsBeat(int[] ar, int ar1[]) {
		int[] samp = new int[ar.length]; // --- 1 2 3 4 5
		for (int i = 0; i < ar.length; i++) {
			samp[i] = ar[i];
		}
		for (int i = 0; i < ar.length; i++) {
			ar[ar1[i]-1] = samp[i];
		}
		System.out.println(Arrays.toString(ar));

		return ar;
	}

}

/*
 * 
 * List<Integer> li=Arrays.asList(ar); List<Integer> li1=Arrays.asList(ar1);
 * List<Integer> res=new ArrayList<>();
 * 
 * 
 * 
 * 
 * 
 */