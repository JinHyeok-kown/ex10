package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(3, Calc.sum(1,2));
		assertEquals(7, Calc.sum(1,6));
		assertEquals(10, Calc.sum(5,5));
	}

}
