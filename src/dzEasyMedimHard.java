import java.util.Scanner;

public class dzEasyMedimHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int x = scanner.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int y = scanner.nextInt();
        int[][] tempArray = new int[x][y];
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray[i].length; j++) {
                int a = (int) (Math.random() * 10);
                tempArray[i][j] = a;
                System.out.print(" " + tempArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Переворот по часовой стрелке: ");
        if (tempArray.length < tempArray[0].length) {
            int[][] newArray = new int[tempArray[0].length][tempArray.length];
            for (int i = 0; i < newArray.length; i++) {
                for (int j = 0; j < newArray[i].length; j++) {
                    newArray[i][j] = tempArray[tempArray.length - j - 1][i];
                    System.out.print(" " + newArray[i][j] + " ");
                }
                System.out.println();
            }
        } else {

            int[][] newArray = new int[tempArray[0].length][tempArray.length];

            System.out.println();
            for (int i = 0; i < newArray.length; i++) {
                for (int j = 0; j < newArray[i].length; j++) {
                    newArray[i][j] = tempArray[tempArray.length - j - 1][i];
                    System.out.print(" " + newArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}