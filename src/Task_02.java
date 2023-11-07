import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("Задание №2");

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
            result <<= 1;
        }
        System.out.println(result);
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = sc.nextInt();
        int pow = 2<< n - 1;
        System.out.println(pow);
    }
}
