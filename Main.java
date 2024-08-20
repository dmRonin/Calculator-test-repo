import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        Calc(input);
    }
    public static String Calc(String input) {
        try {
            String[] parts = input.split(" ");
            if(parts.length < 3) throw new Exception("Строка не является математической операцией");
            int firstOperand = Integer.parseInt(parts[0]);
            if (firstOperand < 1 || firstOperand > 10) throw new Exception("Первое число должно быть в диапазоне от 1 до 10 включительно");
            int secondOperand = Integer.parseInt(parts[2]);
            if (secondOperand < 1 || secondOperand > 10) throw new Exception("Второе число должно быть в диапазоне от 1 до 10 включительно");
            char operator = parts[1].charAt(0);
            if (parts.length> 3) throw new Exception("Формат математической операции не удовлетворяет заданию");
             switch (operator) {
                 case '+':
                     input = String.valueOf(firstOperand + secondOperand);
                     break;
                 case '-':
                     input = String.valueOf(firstOperand - secondOperand);
                     break;
                 case '*':
                     input = String.valueOf(firstOperand * secondOperand);
                     break;
                 case '/':
                     if (secondOperand == 0) throw new Exception("Деление на ноль запрещено");
                     input = String.valueOf(firstOperand / secondOperand);
                     break;
                 default: throw new Exception("Неизвестная операция");
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
            return input;
    }
}
