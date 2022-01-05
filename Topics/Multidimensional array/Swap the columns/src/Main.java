import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int col1 = scanner.nextInt();
        int col2 = scanner.nextInt();
        int temp = 0;
        for (int i = 0; i < row; i++) {
            temp = array[i][col1];
            array[i][col1] = array[i][col2];
            array[i][col2] = temp;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}