import java.util.Scanner;

public class Ex02Max {

    public static void main(String args[]){

        Scanner arg = new Scanner(args[0]);
        int N = arg.nextInt(); // Number of elements to scan

        int temp;
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();
        int indexMax = 0;

        for(int i = 1; i < N; i++){
            temp = input.nextInt();
            
            if (temp > max){
                max = temp;
                indexMax = i;
            }
        }

        System.out.println("Maior nº é o " + max + ", no índice " + indexMax);

    }
}

