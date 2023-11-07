import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        System.out.println("Задание №5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = sc.nextInt();
        int i = sc.nextInt();

        int mask =~(1 << i);
        N &= mask;
        System.out.println(Integer.toBinaryString(N));
    }
}
