import java.util.Scanner;

public class Ex03Max10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int temp;
        for(int i = 1; i < 10; i++){
            temp = sc.nextInt();
            max = Math.max(max, temp);
        }

        System.out.println(max);
    }

}
