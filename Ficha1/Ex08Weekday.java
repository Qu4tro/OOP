import java.util.Scanner;

public class Ex08Weekday {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dia[1-31]: ");
        int day = sc.nextInt();
        System.out.println("Mês[1-12]: ");
        int month = sc.nextInt();
        System.out.println("Ano[1901-2099]: ");
        int year = sc.nextInt();

        System.out.println(getWeekday(day, month, year));

    }


    public static String getWeekday(int day, int month, int year){

        int weekday;
        String weekdays[] = {"Domingo",
                             "Segunda",
                             "Terça",
                             "Quarta",
                             "Quinta",
                             "Sexta",
                             "Sábado"};

        int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // a
        // i
        weekday = (year - 1900) * 365;
        // ii
        weekday += (year - 1900) / 4;
        // iii
        if ((month == 1 || month == 2) && isLeapYear(year))
            weekday--;
        // iv
        for(int i = 0; i < month; i++)
            weekday += daysInMonth[i];
        weekday += day;

        // b
        weekday %= 7;

        //c
        return weekdays[weekday];
    }

    public static boolean isLeapYear(int year) {

        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }



}

