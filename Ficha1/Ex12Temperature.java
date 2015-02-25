import java.util.Scanner;

public class Ex12Temperature {

    public static void main(String[] args) {

        int n = parseN(args);
        int temp1;
        int temp2;
        int total = 0;
        int maxDelta = 0;
        int maxDeltaDay = 0;
        double avg;

        Scanner sc = new Scanner(System.in);

        temp1 = sc.nextInt();
        total += temp1;
            
        for (int i = 1; i < n ; i++){
            temp2 = sc.nextInt();

            if (Math.abs(maxDelta) <= Math.abs(temp2 - temp1)){
                maxDelta = temp2 - temp1;
                maxDeltaDay = i + 1;
            }

            temp1 = temp2;
            total += temp1;
        }

        avg = (double) total / n;

        output(avg, maxDeltaDay, maxDelta);

       }

    public static int parseN(String[] args){
    
        int n = 0;

        if (args.length < 1){
            System.out.println("Requer argumento: n");
            System.exit(1);
        }
        else {
            Scanner scArgs = new Scanner(args[0]);
            n = scArgs.nextInt();

            if (n < 2){
                System.out.println("n tem que ser >= 2");
                System.exit(1);
            }
        }
        return n;
    }

    public static void output(double avg, int day, int deltaDegrees){
    
        System.out.printf("A média das n temperaturas foi de %02.2f graus.\n", avg);
        System.out.printf("A maior variação de temperatura registou-se entre os dias %02d e %02d e foi de %03d graus.\n", day - 1, day, deltaDegrees);
        // TODO
        // outra vez, dizer quanto variou a temperatura???
    }
    
}
