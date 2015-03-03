import java.util.Scanner;
import java.util.Arrays;

public class Ex06Slice {

    public static void main(String[] args) {

        int index1;
        int index2;
        Scanner input = new Scanner(System.in);

        Scanner sc = new Scanner(args[0]);
        int N = sc.nextInt();
        int array[] = getArrayFromInput(N);


        System.out.print("Inserir índice: ");
        index1 = input.nextInt();
        System.out.print("Inserir índice: ");
        index2 = input.nextInt();

        int sliced[] = slice(array, index1, index2);

        System.out.println(Arrays.toString(sliced));

    }

    private static int[] slice(int[] array, int begin, int end){
    
        int slicedSize = end - begin + 1;
        int[] sliced = new int[slicedSize];

        for(int i = begin; i <= end; i++) {
            sliced[i - begin] = array[i];
        }
    
        return sliced;
    
    }
    
    private static int[] getArrayFromInput(int N){

        Scanner input = new Scanner(System.in);
        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

        return array;
    }

}

