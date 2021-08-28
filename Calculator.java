import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        int first;
        int second;
        String operator;
        System.out.println(" = ");
        first = read.nextInt();
        operator = read.next();
        second = read.nextInt();
        if (operator.equals("+")) {
            System.out.println(" = " + (first + second));
        }
        else if (operator.equals(" - ")) {
            System.out.println(" = " + (first - second));
        }
        else if (operator.equals(" * ")) {
            System.out.println(" = " + (first * second));
        }
        else if (operator.equals(" / ")) {
            System.out.println(" - " + (first / second));
        }
        else { 
            int result = 1;
            for(int i = 1; i < second; i++) {
            result*=first;
        }
            System.out.println(" = " + result);
        }
        if (operator.equals(" % ")) {
            System.out.println(" = " + (first % second));
        }
    }
}