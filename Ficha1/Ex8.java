import java.util.Scanner;

public class Ex8
{

    public static void main(String args[])
    {

        Scanner in1 = new Scanner(args[0]);
        int y = in1.nextInt();
        Scanner in2 = new Scanner(args[1]);
        int m = in2.nextInt();
        Scanner in3 = new Scanner(args[2]);
        int d = in3.nextInt();

        System.out.printf("%s\n", nameOfWeekDay(weekDay(y, m, d)));

    }

    private static int weekDay(int y, int m, int d)
    {
        int days = (y - 1900) * 365;
        days += (y - 1900) / 4;

        if ((m == 1 || m == 2) && isLeap(y))
            days--;

        for(int x = 1; x < m; x++)
            days += daysPerMonth(x);
        days += d;


        return days % 7;
    }

    private static int daysPerMonth(int m)
    {
        switch (m){
            case 1: return 31;
            case 2: return 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
        }
        return 0;
    }

    private static boolean isLeap(int y)
    {
        if (y % 400 == 0)
            return true;
        if (y % 100 == 0)
            return false;
        if (y % 4 == 0)
            return true;
        return false;

    }

    private static String nameOfWeekDay(int n)
    {
        switch (n) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return  "Quarta";
            case 5:
                return  "Quinta";
            case 6:
                return  "Sexta";
            case 7:
                return "Sábado";
            }

        return "";
    }



}
