//TESTING CODE WITH JUNIT - warmup exercise

import org.junit.Test;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testFirstMethod() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testSecondMethod() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
//        languages.add("Java");


        assertNotSame(languages, moreLanguages); // Lists are not the same instance.
//        assertEquals(languages, moreLanguages);
    }

    @Test
    public void testThirdMethod() {
        int[] numbers = {1, 2, 3};

        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }
    @Test
    public void testForthMethod() {
        String language = "PHP";
//        language.contains("H"); // use assertTrue for this statement
//        language.contains("J"); // use assertFalse for this statement

        assertFalse(language.contains("J"));
        assertTrue(language.contains("H"));
    }
}