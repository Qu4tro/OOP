import java.util.Scanner;

public class Ex13Circle {

    public static void main(String[] args) {

        double area;
        double perimeter;
        double radius;

        Scanner sc = new Scanner(System.in);

        System.out.print("Raio: ");
        radius = sc.nextDouble();

        while (radius != 0.0){

            perimeter = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius, 2);

            System.out.printf("Perimetro: %.5f\n", perimeter);
            System.out.printf("Area: %.5f\n\n", area);
        
            System.out.print("Raio: ");
            radius = sc.nextDouble();
        } 
        
    }
    
}
