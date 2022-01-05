import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int currentPosition = 0;
        int counter = 0;

        while (true) {
            counter++;
            currentPosition += a;
            if (currentPosition >= h) {
                break;
            }
            currentPosition -= b;
        }
        System.out.println(counter);

    }
}