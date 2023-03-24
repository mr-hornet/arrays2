import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int a : arr) {
           summ+=a;
        }
        System.out.println("Сумма всех выплат равна = " + summ);
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int a : arr) {
            if (a < min) {
                min = a;
            } else if (a > max) {
                max = a;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.\n" +
                "Максимальная сумма трат за день составила "+ max + " рублей");
    }


    private static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double medium = 0.0;
        int count = 0;
        int summ = 0;
        for (int a : arr) {
            summ+=a;
            count++;
        }
        medium = (double) summ / count;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", medium);
        System.out.println();

    }

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}