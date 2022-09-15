package vasanth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

class SumOfPrimeWithoutSmallestTest extends SumOfPrimeWithoutSmallest {
	static List<Integer> lis = new ArrayList<>();
	
	@Test
	public void prime2isTrue() {
		int result=0;
		if (li.size()>0) {
			for (int i : li) {
				if(isPrime(i)) {
					lis.add(i);
				}
			}
			Collections.sort(lis);
			lis.set(0,0);

			for(int i: lis) {
				
				result=result + i;
			}
			assertEquals(result,SumOfPrimeWithoutSmallest.sum());
		}
	}
	@Test
	public void shouldThrowIndexException() {
		if(in()<1) {
			assertThrows(IndexOutOfBoundsException.class,()->SumOfPrimeWithoutSmallest.sum());
		}
	}

	@Test
	void isPrimeFalse() {
		int num1 = 10;
		assertEquals(false, SumOfPrimeWithoutSmallest.isPrime(num1));
	}

	@Test
	void isPrimeTrue() {
		int num2 = 19;
		assertEquals(true, SumOfPrimeWithoutSmallest.isPrime(num2));
	}

	@Test
	void isPrimeForZeroAndOne() {
		int num3 = 0;
		assertEquals(false, SumOfPrimeWithoutSmallest.isPrime(num3));
		num3++;
		assertEquals(false, SumOfPrimeWithoutSmallest.isPrime(num3));
	}
}
