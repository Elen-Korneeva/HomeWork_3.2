import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = scanner.nextInt();

        int count = 0;
        while (N!= 0) {
            if ((N & 1) == 1) {
                count ++;
            }
            N >>= 1;
        }
        System.out.println("Количество единичных битов:" + count);
        System.out.println("Исходное число в двоичном виде: " + Integer.toBinaryString(N));
    }
}
