public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        int N = 3;
        int mask = ~ (1<<0);
        int result = N & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}
