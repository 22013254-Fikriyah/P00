import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Fiqriyah, 26 May 2023 11:55:10 am
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Fiqriyah, 26 May 2023 11:55:10 am
 */

public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,  b);
		
		int expected = 9999;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubstract() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = -7531;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiply() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 10816010;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 0;
		assertEquals(expected, actual);
	}

}
