import java.util.Scanner;

public class Ex10DiffDays {

    public static void main(String[] args) {
        
       // ?? A diferença entre duas datas e pede segundos? 

    }

    public static int[] getDate(){
        int array[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Dia[1-31]: ");
        array[0] = sc.nextInt();
        System.out.println("Mês[1-12]: ");
        array[1] = sc.nextInt();
        System.out.println("Ano[1901-2099]: ");
        array[2] = sc.nextInt();

        return array;
    }

    // TODO

    
}
