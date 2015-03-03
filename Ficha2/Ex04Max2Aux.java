import java.util.Scanner;

public class Ex04Max2Aux {

    public static void main(String args[]){

        Scanner arg = new Scanner(args[0]);
        int sizeOfArray = arg.nextInt();

        int[] array = getArrayFromInput(sizeOfArray);

        int[] maior = maximo(array);

        System.out.printf("Maior nº é o %d, no índice %d\n", maior[0], maior[1]);
    }

    private static int[] maximo(int array[]){
        int[] maior = {array[0], 0};

        for(int i = 1; i < array.length; i++)
            if (array[i] > maior[0]){
                maior[0] = array[i];
                maior[1] = i;}

        return maior;
    }

    private static int[] getArrayFromInput(int N){

        Scanner input = new Scanner(System.in);
        int[] array = new int[N];

        for(int i = 0; i < N; i++)
            array[i] = input.nextInt();

        return array;
    }

}

