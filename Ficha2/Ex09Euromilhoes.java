import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Key{

    public static int[] generateKey(){

        Random rand = new Random();
        int[] key = new int[7];
        int randN;

        for(int i = 0; i < 5; i++) {
            randN = rand.nextInt(50) + 1;
            if (contains(key, randN)){
                i--;
            } else {
                key[i] = randN;
            }
        }

        for(int i = 5; i < 7; i++) {
            randN = rand.nextInt(9) + 1;
            if (contains(key, randN)){
                i--;
            } else {
                key[i] = randN;
            }
        }

        return key;
    }

    public static void printKey(int[] key){

        System.out.println("\nNúmeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(key[i] + " ");
        }
        System.out.println("\nEstrelas: ");
        for (int i = 5; i < 7; i++) {
            System.out.print(key[i] + " ");
        }

        System.out.println("");
    
    }

    static int[] checkKey(int[] key, int[] array){

        int[] correct = {0, 0};

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if (key[i] == array[j]){
                    correct[0] += 1;
                }
            }
        }

        for(int i = 5; i < 7; i++) {
            for(int j = 5; j < 7; j++) {
                if (key[i] == array[j]){
                    correct[1] += 1;
                }
            }
        }

        return correct;
    }

    static int[] askKey(){

        Scanner sc = new Scanner(System.in);
        int[] key = new int[7];
    
        System.out.println("Insira 5 números de 1 a 50:");
        for(int i = 0; i < 5; i++) {
            key[i] = sc.nextInt();
        }

        System.out.println("Insira 2 estrelas de 1 a 9:");
        for(int i = 5; i < 7; i++) {
            key[i] = sc.nextInt();
        }

        return key;
    }

    static boolean contains(int[] array, int x){
    
        for(int y : array) {
            if (x == y){
                return true;
            }
        }
        return false;
    }



}


public class Ex09Euromilhoes {
    
    public static void main(String[] args) {

        int[] random;
        int[] guess;

        int[] correct;

        random = Key.generateKey();
        guess = Key.askKey();

        Key.printKey(random);

        correct = Key.checkKey(random, guess);
        System.out.println(correct[0] + " números correctos e " + correct[1] + " estrelas correctas.");

    }

}
