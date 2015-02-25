import java.util.Scanner;

public class Ex04Exp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double exp = sc.nextDouble();

        for(int i = 0; i < n; i++){
            double real = sc.nextDouble();
            System.out.println(Math.pow(real, exp));
        }
    }

}
