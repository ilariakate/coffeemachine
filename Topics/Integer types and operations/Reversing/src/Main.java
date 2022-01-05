import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();

        int ones = num % 10;
        int tens = (num % 100) / 10;
        int hundreds = num / 100;

        System.out.print(ones * 100 + tens * 10 + hundreds);


    }
}