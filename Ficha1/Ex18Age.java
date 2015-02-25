import java.util.Scanner;
import java.util.GregorianCalendar;

public class Ex18Age {

    public static void main(String[] args) {

        int date[] = getDate();
        int today[] = getToday();

        System.out.print("Data dada:   ");
        printDate(date);
        System.out.print("Data actual: ");
        printDate(today);
        System.out.printf("Idade: %d\n", getAge(date, today));

    }

    public static int getAge(int[] date1, int[] date2){
    
        int age = date2[0] - date1[0];

        if (date2[1] < date1[1] || (date2[1] == date1[1] && date2[2] < date1[2]))
            age--;

        return age;
    
    }

    public static void printDate(int[] date){
        System.out.printf("%02d/%02d/%d\n", date[2], date[1], date[0]);
    }

    public static int[] getDate(){
        int array[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Ano[1901-2099]: ");
        array[0] = sc.nextInt();
        System.out.print("Mês[1-12]: ");
        array[1] = sc.nextInt();
        System.out.print("Dia[1-31]: ");
        array[2] = sc.nextInt();

        return array;
    }

     public static int[] getToday(){
        int array[] = new int[3];
        GregorianCalendar cal = new GregorianCalendar();
        array[0] = cal.get(GregorianCalendar.YEAR);
        array[1] = cal.get(GregorianCalendar.MONTH) + 1;
        array[2] = cal.get(GregorianCalendar.DAY_OF_MONTH);

        return array;
    }
   
}
