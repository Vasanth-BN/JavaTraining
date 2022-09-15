package vasanth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PasswordTestTest {

	@Test
	void passwordEquals192() {
		var testing =new PasswordTest();
		Integer[] arr = { 12,34,56,12,7,19,19,02,02,19,02,19 };
		assertEquals(testing.freqPass(arr),"192");
	}
	@Test
	void  passwordEquals1040() {
		var testing =new PasswordTest();
		Integer[]arr= {10,20,20,10,10,40,40,40,10,2,10,1};
		assertEquals(testing.freqPass(arr),"1040");
	}

	@Test
	void  passwordEquals1012() {
		var testing =new PasswordTest();
		Integer[]arr= {10,20,20,10,10,12,12,12,10,2,10,1};
		assertEquals(testing.freqPass(arr),"1012");
	}
}
