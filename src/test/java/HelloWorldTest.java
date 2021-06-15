import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    private String expected;

    @Before
    public void setUp() {
        this.expected = "Hello, World!";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfHelloWorldWorks() {
        String expected = "Hello, World!";
        String expectedDave = "Hello, Dave!";

        assertEquals(expected, HelloWorld.hello());
        assertEquals(expectedDave, HelloWorld.hello("Dave"));
        assertNotEquals("Hello, null!", HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello(null));
        assertNotNull(HelloWorld.hello());
    }
}
