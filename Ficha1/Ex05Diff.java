import java.util.Scanner;

public class Ex05Diff {

    public static void main(String[] args) {

        int min;
        int max;
        int diff;
        int curr;
        Scanner sc = new Scanner(System.in);

        curr = sc.nextInt();
        min = curr;
        max = curr;
        while (curr != -1) {

            min = Math.min(min, curr);
            max = Math.max(max, curr);

            curr = sc.nextInt();
        }

        diff = max - min;

        System.out.println("Min: "   + min);
        System.out.println("Max: "   + max);
        System.out.println("Diff: "  + diff);
    }
}
