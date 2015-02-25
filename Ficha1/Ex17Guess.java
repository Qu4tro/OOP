import java.util.Scanner;
import java.util.Random;

public class Ex17Guess {

    public static void main(String[] args) {

        Random r = new Random();
        int number;

        while (true){

            number = r.nextInt(100) + 1;

            for (int i = 0; i < 3; i++) {
                if (number != getAttempt()){
                    System.out.println("Errado!");
                } else {
                    System.out.println("Certo!");
                    break;
                }
            }

            if (!playAgain())
                break;
        }
        
    }

    public static int getAttempt(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um número entre 1 e 100: ");
        return sc.nextInt();

    }

    public static boolean playAgain(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Quer jogar de novo(y/n)? ");
        String response = sc.next();

        return response.equals("y");
    }


    
}
