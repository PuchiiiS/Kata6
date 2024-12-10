package Software.ulpgc.kata6.commands;

import java.util.Locale;

public class MathCommand implements Command{

    @Override
    public int execute(String operation, int a, int b){
        switch (operation.toLowerCase()){
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divison":
                if(b == 0){
                    throw new ArithmeticException("El dividendo no puede ser 0");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operacion invalida");
        }
    }
}
