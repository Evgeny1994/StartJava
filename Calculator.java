import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int first;
        int second;
        String operator;
        first = read.nextInt();
        operator = read.next();
        second = read.nextInt();
        System.out.println("введите первое число, введите математический знак, введите второе число");
        if (operator.equals("+")) {
            System.out.println(" = " + (first + second));
        } else if (operator.equals(" - ")) {
            System.out.println(" = " + (first - second));
        } else if (operator.equals(" * ")) {
            System.out.println(" = " + (first * second));
        } else if (operator.equals(" / ")) {
            System.out.println(" - " + (first / second));
        } else if (operator.equals(" ^ ")) { 
            int result = 1;
                for(int i = 1; i < second; i++) {
                result*=first;
            }
                System.out.println(" = " + result);
        } else if (operator.equals(" % ")) {
            System.out.println(" = " + (first % second));
        }
    }
}