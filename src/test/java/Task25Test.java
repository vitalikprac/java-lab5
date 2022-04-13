import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Task25Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test
    public void createAndPrintPolynomial(){
        var polynomial = new Polynomial(new float[]{1,2,3});
        System.out.println(polynomial);
        Assert.assertEquals("""
                Polynomial{coefficients=[1.0, 2.0, 3.0]}\r
                """, outContent.toString());
    }

    @Test
    public void createAndPrintRationalPolynomial(){
        var rationalExpression = new RationalExpression(new float[]{1,2,3},new float[]{3,4,5});
        System.out.println(rationalExpression);
        Assert.assertEquals("""
                RationalExpression{numerator=[1.0, 2.0, 3.0], denominator=[3.0, 4.0, 5.0]}\r
                """, outContent.toString());
    }


}