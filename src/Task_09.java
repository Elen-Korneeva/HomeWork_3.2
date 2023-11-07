import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        System.out.println("Задание №9");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число M: ");
        int M = scanner.nextInt();
        System.out.println("Введите число N: ");
        int N = scanner.nextInt();

        int signMask = M & (1 << 31);
        int signN = N & (1 << 31);

        if (signMask!= signN) {
            System.out.println("Числа имеют разные знаки");
        } else {
            System.out.println("Числа имеют одинаковые знаки");
        }
    }
}
