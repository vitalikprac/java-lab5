import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.List;


public class Task5Test {
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
    public void printMessageForum() {
        var messageForum = new MessageForum("Test author","Test topic","Test text",
                LocalDateTime.of(2022,2,2,22,22));
        Assert.assertEquals(messageForum.toString(),
                "Test topic | Test text © Test author, (2022-02-02T22:22) edited (2022-02-02T22:22)");

    }

    @Test
    public void editMessageForum() {
        var messageForum = new MessageForum("Test author","Test topic","Hello world",
                LocalDateTime.of(2022,1,1,12,0));
        Assert.assertEquals(messageForum.toString(),
                "Test topic | Hello world © Test author, (2022-01-01T12:00) edited (2022-01-01T12:00)");
        messageForum.editText("Edit message works!",
                LocalDateTime.of(2022,1,1,13,0));
        Assert.assertEquals(messageForum.toString(),
                "Test topic | Edit message works! © Test author, (2022-01-01T12:00) edited (2022-01-01T13:00)");
    }


}