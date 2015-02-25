import java.util.Scanner;

public class Ex15LowerOdds {

    public static void main(String[] args) {

        Scanner sc = new Scanner(args[0]);
        printLowerOdds(sc.nextInt());

    }

    public static void printLowerOdds(int n){
    
        if (n % 2 == 0)
            n--;
        else
            n -= 2;

        while (n > 0){
            System.out.println(n);
            n -= 2;
        }
    }
    
}
