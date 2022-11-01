public class evenodd {
    static int a = 101;
    public static void main(String[] args) {
        if (a % 2 == 0) {
            evenNumber();
        }
        else {
            oddNumber();
        }
    }
    public static void evenNumber() {
        System.out.println("Четное число!");
    }
    public static void oddNumber() {
        System.out.println("Нечетное число!");
    }
}
