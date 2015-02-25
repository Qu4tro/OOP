import java.util.Scanner;

public class Ex11Average {
    
    public static void main(String[] args) {

        int n = 0;
        int total = 0;
        double avg;
        
        if (args.length < 1){
            System.out.println("Requer argumento: n");
            System.exit(1);
        }
        else {
            Scanner scArgs = new Scanner(args[0]);
            n = scArgs.nextInt();
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n ; i++)
            total += sc.nextInt();

        avg = (double) total / n;
        System.out.printf("Média: %f\n", avg);

    }

}
