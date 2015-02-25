import java.util.Scanner;

public class Ex01NomeIdade {

    public static void main(String[] args) {
        ex1();
    }

    public static void ex1(){

        System.out.println("Insira nome e idade:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int idade = sc.nextInt();
        System.out.println("Nome " + name + ", " + idade);

    }
}
