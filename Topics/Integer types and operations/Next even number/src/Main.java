import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int givenNumber = scanner.nextInt();
        if (givenNumber % 2 == 0) {
            System.out.println(givenNumber + 2);
        } else {
            System.out.println(givenNumber + 1);
        }
    }
}