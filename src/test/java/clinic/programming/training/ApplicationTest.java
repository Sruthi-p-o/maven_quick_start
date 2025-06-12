package clinic.programming.training;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {

    private Application app;

    @Before
    public void setup() {
        app = new Application();
    }

    @Test
    public void testCountWords() {
        int result = app.countWords("hello world");
        assertEquals(2, result);
    }
}
