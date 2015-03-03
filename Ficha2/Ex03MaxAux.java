import java.util.Scanner;

public class Ex03MaxAux {

    public static void main(String args[]){

        Scanner arg = new Scanner(args[0]);
        int sizeOfArray = arg.nextInt();

        int max = Integer.MIN_VALUE;
        int indexMax = 0;

        int[] array = getArrayFromInput(sizeOfArray);

        for(int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                indexMax = i;
            }
        }

        System.out.printf("Maior nº é o %d, no índice %d\n", max, indexMax);

    }

    private static int[] getArrayFromInput(int N){

        Scanner input = new Scanner(System.in);
        int[] array = new int[N];

        for(int i = 0; i < N; i++)
            array[i] = input.nextInt();

        return array;
    }

}

