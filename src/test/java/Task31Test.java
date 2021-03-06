import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Task31Test {
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
    public void createAndPrintCar(){
        var car = new Car("Test brand",5,200);
        System.out.println(car);
        Assert.assertEquals("""
                Car{brand='Test brand', cylindersCount=5, power=200}\r
                """, outContent.toString());
    }

    @Test
    public void createAndPrintTruck(){
        var truck = new Truck("Test brand",5,200,999);
        System.out.println(truck);
        Assert.assertEquals("""
                Truck{loadCapacity=999}\r
                """, outContent.toString());
    }

}