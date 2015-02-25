import java.util.Scanner;

public class Ex02Sort3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();

        int max = Math.max(i1, Math.max(i2, i3));

        if (max == i1)
            printInOrder(Math.min(i2, i3), Math.max(i2, i3), i1);
        else if (max == i2)
            printInOrder(Math.min(i1, i3), Math.max(i1, i3), i3);
        else
            printInOrder(Math.min(i2, i1), Math.max(i2, i1), i3);
    }

    public static void printInOrder(int min, int med, int max){
        System.out.println(min + ", " + med + ", " + max);
    }
}
