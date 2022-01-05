import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int gp1 = scanner.nextInt();
        int gp2 = scanner.nextInt();
        int gp3 = scanner.nextInt();

        int noOfDesks = gp1 / 2 + gp1 % 2
                + gp2 / 2 + gp2 % 2
                + gp3 / 2 + gp3 % 2;

        System.out.println(noOfDesks);


    }
}