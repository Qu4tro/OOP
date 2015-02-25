import java.util.Scanner;

public class Ex16Menu {

    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);

        menu();
        System.out.print("Opção: ");
        choice = sc.nextInt();
        System.out.println("");

        while (choice != 5){
            System.out.println(returnChoice(choice));

            menu();
            System.out.print("Opção: ");
            choice = sc.nextInt();
            System.out.println("");

        
        }
    }

    public static void menu(){
        System.out.println("1.- Inserir");
        System.out.println("2.- Remover");
        System.out.println("3.- Consultar");
        System.out.println("4.- Gravar");
        System.out.println("5.- Sair");
    }

    public static String returnChoice(int choice){

        switch (choice){
            case 1: return "Inserir";
            case 2: return "Remover";
            case 3: return "Consultar";
            case 4: return "Gravar";
        }

        return "Opção Inválida!";
    }

}
