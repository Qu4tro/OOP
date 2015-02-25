import java.util.Scanner;

public class Ex14SumProd {

    public static void main(String[] args) {

        double sum = 0;
        double prod = 1;
        double number;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 0 para parar.");
        
        System.out.print("Insira um número: ");
        number = sc.nextDouble();

        while (number != 0.0){

            sum += number;
            prod *= number;
        
            System.out.print("Mais um número: ");
            number = sc.nextDouble();
        } 
        
        System.out.printf("Somatório: %.4f\n", sum);
        System.out.printf("Produtório: %.4f\n", prod);

    }
    
}
