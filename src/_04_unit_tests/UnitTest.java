package _04_unit_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
	public static void main(String[] args) {
		assertEquals(4, add(2,2));	
	}
static int add(int one, int two) {
	return one+two;
}
}
