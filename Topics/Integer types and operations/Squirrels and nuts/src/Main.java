import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int noOfSquirrels = scanner.nextInt();
        int noOfNuts = scanner.nextInt();
        int remainder = noOfNuts % noOfSquirrels;
        System.out.println(remainder);
    }
}