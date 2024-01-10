import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Составить алгоритм: если введенное число больше 7, то вывести “Привет”
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner1.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

        // 2.Составить алгоритм: если введенное имя совпадает с Вячеслав,то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
        System.out.println("Введите имя: ");
        String name = new Scanner(System.in).nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        // 3.Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        int[] numbers = {56, 34, 78, 90, 100};
        for (int i : numbers) {
            if (i % 3 == 0) {
                System.out.println("Элемент массива кратный 3 " + i);
            }
        }

    }
}