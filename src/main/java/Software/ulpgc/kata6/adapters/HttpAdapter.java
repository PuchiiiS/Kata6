package Software.ulpgc.kata6.adapters;

import Software.ulpgc.kata6.commands.MathCommand;

public class HttpAdapter {
    public static String handle(String operation, String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        MathCommand mathCommand = new MathCommand();
        return String.valueOf(mathCommand.execute(operation, num1, num2));
    }
}
