import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String action = scanner.nextLine();
        switch (action) {
            case "rectangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double areaR = a * b;
                System.out.println(areaR);
                break;
            case "circle":
                double r = scanner.nextDouble();
                double pi = 3.14;
                double areaC = pi * Math.pow(r, 2);
                System.out.println(areaC);
                break;
            case "triangle":
                double e = scanner.nextDouble();
                double f = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (e + f + c) / 2;
                double areaT = Math.sqrt(p * (p - e) * (p - f) * (p - c));
                System.out.println(areaT);
                break;
            default:
                System.exit(1);
                break;
        }
    }

}