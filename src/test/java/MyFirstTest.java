import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class MyFirstTest {

//    private String expected;

//    @Before
//    public void setUp() {
//        this.expected = "Codeup";
//    }

    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
        assertNotEquals("Codeup", "CodeUp");

    }

//    @Test
//    public void test


}
