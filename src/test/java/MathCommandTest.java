import Software.ulpgc.kata6.commands.MathCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathCommandTest {

    @Test
    void testAddition(){
        MathCommand mathCommand = new MathCommand();
        int result = mathCommand.execute("add", 5, 4);
        assertEquals(9, result);
    }

    @Test
    void testSubtraction(){
        MathCommand mathCommand = new MathCommand();
        int result = mathCommand.execute("subtract", 5, 4);
        assertEquals(1, result);
    }

    @Test
    void testAMultiplication(){
        MathCommand mathCommand = new MathCommand();
        int result = mathCommand.execute("multiply", 5, 4);
        assertEquals(20, result);
    }

    @Test
    void testDivison(){
        MathCommand mathCommand = new MathCommand();
        int result = mathCommand.execute("add", 20, 4);
        assertEquals(5, result);
    }
}
