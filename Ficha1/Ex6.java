import java.util.Scanner;

public class Ex6
{

    public static void main(String args[])
    {
        Scanner input = new Scanner(args[0]);
        System.out.printf("%d\n", factorial(input.nextInt()));
    }

    private static long factorial(int n)
    {
        long factorial = 1;
        while (n != 1)
            factorial *= n--;
        return factorial;
    }






}
