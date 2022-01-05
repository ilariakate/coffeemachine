import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] twoDimArr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDimArr[i][j] = scanner.nextInt();
            }
        }

        for (int col = 0; col < m; col++) {
            for (int row = n - 1; row >= 0; row--) {
                System.out.print(twoDimArr[row][col] + " ");
            }
            System.out.println("");
        }

    }
}