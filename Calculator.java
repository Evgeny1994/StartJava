import java.util.Scanner;
public class Calculator{
    private static  Scanner read;
    public static void main (String[] args)
    {
    read = new Scanner(System.in);
    int first;
    int second;
    String operator;
    System.out.println("=");
    first = read.nextInt();
    operator = read.next();
    second = read.nextInt();
    if (operator.equals("+")) {
        System.out.println("=" + (first + second));
    }
    if (operator.equals("-")) {
        System.out.println("=" + (first - second));
    }
    if (operator.equals("*")) {
        System.out.println("=" + (first * second));
    }
    if (operator.equals("/")) {
        System.out.println("-" + (first / second));
    }
    if (operator.equals("^")) {
        System.out.println("-" + (first * second));
    }
    if (operator.equals("%")) {
        System.out.println("=" + (first % second));
    }
    }
}