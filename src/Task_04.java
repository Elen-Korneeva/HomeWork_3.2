import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        System.out.println("Задание №4");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = sc.nextInt();
        int i = sc.nextInt();

        int mask = 1 << i;
        N ^= mask;
        System.out.println(Integer.toBinaryString(N));
    }
}
