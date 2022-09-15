package vasanth;

import java.util.ArrayList;

public class FuelPriceSum {
	public static void main(String... arg) {
		int a = 5, res = 0;
		final int n = 105;
		int preSum = 0, sufSum = 0;
		int sum = 0, sum2 = 0, max = 0;
		int[] ar = { 10,20,30,40,100};
		int arr[] = { 20,20,40,40,10 };
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		for (int i = 0; i < ar.length; i++) {
			if (sum <= n) {
				sum += ar[i];
				list1.add(sum);
			}
			for (int j = i+1; j < ar.length; j++) {
				
					sum2 = ar[i] + ar[j];
					if (sum2 <= n) {
						res = Math.max(sum2, res);
						if(res==sum2) {
							preSum=arr[i]+arr[j];
							list.add(preSum);
							
						}
					}
					

				

			}
			if(Math.max(res, sum)==sum) {
				if(sum<=n)
				sufSum+=arr[i];
			}
		}
		max=Math.max(preSum,sufSum);
		System.out.println(max);
	}
}
//if(sum==n && sum>max) {
//	max=arr[i]+arr[j];
//}


/*10, 10, 40, 50, 90 
 * 10, 20, 20, 50, 150
 * 
 * 
 * 
 * prefix_sum = arr[i];
 * 
 * for (int j = 0; j < i; j++) prefix_sum += arr[j];
 * 
 * int suffix_sum = arr[i];
 * 
 * for (int j = n - 1; j > i; j--) suffix_sum += arr[j];
 * 
 * if (prefix_sum == suffix_sum) res = Math.max(res, prefix_sum);
 * 
 */