import Software.ulpgc.kata6.adapters.HttpAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpAdapterTest {
    @Test
    void TestHandleAdd(){
        String result = HttpAdapter.handle("add", "2", "5");
        assertEquals("7", result);
    }
}
