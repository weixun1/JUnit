import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test class for solving square roots
 */
public class SquareRootTests {

	private Calculator calc;
    // TODO: Assignment 4 Part 2 -- Checkpoint4

    @Before public void setUp() throws Exception {
    	calc = new Calculator();
    }

    @After public void tearDown() throws Exception {
    }

    @Test public void testRandomPositiveSquareRoot() {
        // You cannot use the Math.sqrt() function in the test!
        double arg = Math.random();
        if(arg < 0)
        {
        	arg = arg * -1;
        }
        Double[] sqrRoots = calc.sqrRoot(arg);
        Double zero = sqrRoots[0] + sqrRoots[1];
        
        assertEquals(sqrRoots.length,2);
        assertEquals(zero, Double.valueOf(0));
        
    }

    @Test public void testRandomNegitiveSquareRoot() {
        // The result should be a complex number i.e. Double.isNaN()
        double arg = Math.random();
        if(arg > 0)
        {
        	arg = arg * -1;
        }
        Double[] sqrRoots = calc.sqrRoot(arg);
        
        assertEquals(sqrRoots.length,2);
        assertTrue(sqrRoots[0].isNaN());
        assertTrue(sqrRoots[1].isNaN());
    }

    @Test public void testSquareRootofZero() {
        // You cannot use the Math.sqrt() function in the test!
        double arg = 0;
        Double[] sqrRoots = calc.sqrRoot(arg);
        Double zero = sqrRoots[0];
        
        assertEquals(sqrRoots.length,2);
        assertEquals(zero, Double.valueOf(0));
    }

    @Test public void testSquareRootofOne() {
        // You cannot use the Math.sqrt() function in the test!
        double arg = 1;
        Double[] sqrRoots = calc.sqrRoot(arg);
        Double zero = sqrRoots[0] + sqrRoots[1];
        
        assertEquals(sqrRoots.length,2);
        assertEquals(zero, Double.valueOf(0));
    }

}
