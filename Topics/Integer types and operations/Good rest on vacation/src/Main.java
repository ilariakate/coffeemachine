import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationInDays = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int costOfNightStay = scanner.nextInt();
        int durationInNight = durationInDays - 1;
        int twoWayFlight = oneWayFlight * 2;

        System.out.println((durationInDays * foodCost) + twoWayFlight + (costOfNightStay * durationInNight));


    }
}