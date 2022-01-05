import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int nRow = scanner.nextInt();
        int mCol = scanner.nextInt();
        int[][] twoDimArr = new int[nRow][mCol];
        int max = Integer.MIN_VALUE;
        int xAxis = twoDimArr[0][0];
        int yAxis = twoDimArr[0][0];


        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < mCol; j++) {
                twoDimArr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < mCol; j++) {
                if (twoDimArr[i][j] > max) {
                    max = twoDimArr[i][j];
                    xAxis = i;
                    yAxis = j;

                }
            }
        }
        System.out.println(xAxis + " " + yAxis);

    }
}