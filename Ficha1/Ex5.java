import java.util.Scanner;

public class Ex5
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int maior = k;
        int menor = k;

        while (k != -1)
        {
            if (k < menor)
                menor = k;
            if (k > maior)
                maior = k;
            k = input.nextInt();
        }

        System.out.printf("%d %d %d", maior - menor, maior, menor);

    }


}
