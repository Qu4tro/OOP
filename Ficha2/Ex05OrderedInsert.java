import java.util.Scanner;
import java.util.Arrays;

public class Ex05OrderedInsert {

    public static void main(String[] args) {

        Scanner in = new Scanner(args[0]);
        int N = in.nextInt();

        int array[] = getArrayFromInput(N);

        System.out.println(Arrays.toString(array));
    }


    private static int[] getArrayFromInput(int N){

        Scanner input = new Scanner(System.in);
        int[] array = new int[N];
        Arrays.fill(array, Integer.MAX_VALUE);

        for(int i=0; i < N; i++){
            orderedInsert(array, input.nextInt());
        }

        return array;
    }

    private static int[] orderedInsert(int[] array, int element){

        for (int i = 0; i < array.length; i++) {
            if (element < array[i]){

                for(int j = (array.length - 1); j > i; j--)
                    array[j] = array[j - 1];

                array[i] = element;
                break;
            }
        }
        return array;
    }

   
}
