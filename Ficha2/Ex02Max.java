import java.util.Scanner;

public class Ex02Max {

    public static void main(String args[]){

        Scanner arg = new Scanner(args[0]);
        int N = arg.nextInt();

        int[] array = new int[N];

        int max = Integer.MIN_VALUE;
        int indexMax = 0;

        int x;
        Scanner input = new Scanner(System.in);

        for(int i=0; i < N; i++){
            x = input.nextInt();
            array[i] = x;
            
            if (x > max){
                max = x;
                indexMax = i;
            }
        }

        System.out.printf("Maior nº é o %d, no índice %d\n", max, indexMax);

    }
}

