import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class NewClassTest {

    @Test
    public void numberMethod() {
        NewClass n = new NewClass();
        int result = n.NumberMethod(9, 5);
        int expected_result = 1;
        assertEquals(expected_result, result);
    }

}