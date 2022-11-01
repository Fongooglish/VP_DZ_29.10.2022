import java.util.Scanner;

public class Dev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.printf("Четное число!");
            }
    }
}
