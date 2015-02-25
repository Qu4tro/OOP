import java.util.Scanner;

public class Ex06Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(args[0]);

        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int n){

        int total = 1;
        while(n != 0){
            total *= n;
            n--;
        }

        return total;
    }

}
