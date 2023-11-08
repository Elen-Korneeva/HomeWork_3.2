import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        System.out.println("Задание №6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = scanner.nextInt();
        int i = scanner.nextInt();

        int mask = (1 << i) - 1;
        N &= mask;
        System.out.println(Integer.toBinaryString(N));
    }
}
