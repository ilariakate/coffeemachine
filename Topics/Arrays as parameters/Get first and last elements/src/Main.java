import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int... result) {
        int[] array = new int[2];
        array[0] = result[0];
        array[array.length - 1] = result[result.length - 1];
        return array;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}