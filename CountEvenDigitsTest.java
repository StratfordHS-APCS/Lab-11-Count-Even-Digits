import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CountEvenDigitsTest.
 *
 * @author  Dave Avis
 * @version 1.7.2019
 */
public class CountEvenDigitsTest
{
    /**
     * Testing the CountEvenDigits.countEvens method
     */
    @Test(timeout=2000)
    public void countEvensTest()
    {
        assertEquals("countEvens(1234) failed.", CountEvenDigits.countEvens(1234), 2 );
        assertEquals("countEvens(13579) failed.", CountEvenDigits.countEvens(13579), 0 );
        assertEquals("countEvens(2468) failed.", CountEvenDigits.countEvens(2468), 4 );
        assertEquals("countEvens(1020304050) failed.", CountEvenDigits.countEvens(1020304050), 7 );
    }
}
