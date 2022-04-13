import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertThrows;


public class Task13Test {
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
    public void createAndPrintSquare() throws Exception {
        var square = new Square(5);
        System.out.println(square);
        Assert.assertEquals("""
                Square{a=5.0}\r
                """, outContent.toString());
    }

    @Test
    public void createWithErrorSquare() {
        Exception exception = assertThrows(Exception.class, () -> {
            var square = new Square(-5);
        });
        Assert.assertEquals("Can not create square with side less or equal to 0!", exception.getMessage());
        Assert.assertEquals("", outContent.toString());
    }

    @Test
    public void setCorrectSide() throws Exception {
        var square = new Square(1);
        System.out.println(square);
        square.setSide(5);
        System.out.println(square);
        Assert.assertEquals("""
                Square{a=1.0}\r
                Square{a=5.0}\r
                """, outContent.toString());
    }

    @Test
    public void setWrongSide() {
        Exception exception = assertThrows(Exception.class, () -> {
            var square = new Square(1);
            square.setSide(-5);
        });
        Assert.assertEquals("Can not set side of square less or equal to 0!", exception.getMessage());
        Assert.assertEquals("", outContent.toString());
    }

    @Test
    public void calculateArea() throws Exception {
        var square = new Square(5);
        Assert.assertEquals(square.calculateArea(), 25.0, 0);
    }

    @Test
    public void calculatePerimeter() throws Exception {
        var square = new Square(5);
        Assert.assertEquals(square.calculatePerimeter(), 20.0, 0);
    }


}