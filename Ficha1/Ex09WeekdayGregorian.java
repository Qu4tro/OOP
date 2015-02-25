import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Ex09WeekdayGregorian {

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

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);

        return weekdays[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

}

