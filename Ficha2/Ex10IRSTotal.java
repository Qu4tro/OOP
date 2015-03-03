import java.util.Scanner;

public class Ex10IRSTotal {

    public static void main(String[] args) {
        
        float percentagemRetencao;
        float ret;
        float liquidos;

        float liquidosTotais = 0;
        float brutosTotais = 0;
        float retencaoTotal = 0;

        float[] vencimentosBrutos = readFloats(20);

        for (float vencimento : vencimentosBrutos) {
            percentagemRetencao = retencao(vencimento);
            ret = (percentagemRetencao / 100) * vencimento;
            liquidos = vencimento - ret;
            System.out.println("Brutos: " + vencimento);
            System.out.println("Retencao: " + percentagemRetencao + "% -> " + ret);
            System.out.println("Liquidos: " + liquidos);
            System.out.println("");

            liquidosTotais += liquidos;
            brutosTotais += vencimento;
            retencaoTotal += ret;
        }

        System.out.printf("A empresa pagou %.2f€ em salários. Destes, %.2f€ foram retidos para o IRS e o resto, %.2f€, foram os ganhos liquidos dos funcionários.\n", brutosTotais, retencaoTotal, liquidosTotais);

    }

    public static int retencao(float bruto){

        if (bruto < 0){
            System.out.println("Salário tem que ser positivo.");
            System.exit(1);
        } else if (bruto < 501) {
            return 5;
        } else if (bruto < 1001) {
            return 10;
        } else if (bruto < 2001) {
            return 20; 
        } else if (bruto < 4001) {
            return 30; 
        } else {
            return 40;
        }

        return 0;
    }

    public static float[] readFloats(int n){

        Scanner sc = new Scanner(System.in);
        float[] array = new float[n];
    
        for(int i = 0; i < n; i++) {
            System.out.print("Insira os vencimentos de um funcionário: ");
            array[i] = sc.nextFloat();
        }

        return array;
    }
    
}
