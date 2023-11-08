import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        System.out.println("Задание №8");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = scanner.nextInt();

        int mask = N & (N - 1);
        N &=~mask;
        System.out.println(Integer.toBinaryString(N));
    }
}
