package Test;

import org.junit.Test;
import static org.junit.Assert.*;
import Calculator.JunitTest;

public class JunitTest {

	@Test
	public void testadd()   {
		assertEquals(15,calculator.add(10,5),0);
	}
	
	@Test
	public void testsub() {
		assertEquals(5,calculator.sub(10,5),0);
	}
	
	@Test
	public void testmul() {
		assertEquals(50,calculator.mul(10,5),0);
	}
	
	@Test
	public void testdiv() {
		assertEquals(2,calculator.divInt(10,5),0);
	}
	
}