package vasanth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JawaharHCL {
	public static void main(String...arg) {
		Integer [] arr= {2,3,4,5,5,2};
		List<Integer> li=Arrays.asList(arr);
		List<Integer> list=new ArrayList<>();
		int count=0;
		for(int i=0;i<li.size();i++) {
			if(Collections.frequency(li, li.get(i))>1 && !(list.contains(li.get(i)))) {
				list.add(li.get(i));
				count++;
			}
		}
		System.out.println(count);;
	}
	
}








