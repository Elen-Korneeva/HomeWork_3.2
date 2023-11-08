import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Задание №10");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число M: ");
        int M = scanner.nextInt();
        System.out.println("Введите число N: ");
        int N = scanner.nextInt();

        int min = M & N;
        while ((min & 1) == 0) {
            min >>= 1;
        }
        System.out.println("Минимальное число:" + min);
    }
}
