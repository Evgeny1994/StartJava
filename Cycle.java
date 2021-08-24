public class Cycle {
    public static void main(String[] args) {
        //Выведите на консоль с помощью цикла for все числа от [0, 20]
        for (int i = 0; i <= 20; i++) {
            System.out.println("Все числа от 0 до 20 " + i);
        }

        //Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        int couter = 6;
        while (couter >= -6) {
            System.out.println("Все числа от 6 до -6 " + couter);
            couter-= 2;
        }

        //Сумма нечётных чисел от 10 до 20;
        int sum = 0, i = 11;
        do {
            sum += i;
            i += 2;
        } while (i <= 20);
        System.out.println("Сумма нечётных чисел от 10 до 20 " + sum);
    }
}