import Software.ulpgc.kata6.adapters.HttpAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpAdapterTest {
    @Test
    void TestHandleAdd(){
        String result = HttpAdapter.handle("add", "2", "5");
        assertEquals("7", result);
    }

    @Test
    void TestHandleSubtract(){
        String result = HttpAdapter.handle("subtract", "7", "5");
        assertEquals("2", result);
    }

    @Test
    void TestHandleMultiply(){
        String result = HttpAdapter.handle("multiply", "2", "5");
        assertEquals("10", result);
    }

    @Test
    void TestHandleDivide(){
        String result = HttpAdapter.handle("divide", "10", "2");
        assertEquals("5", result);
    }
}
