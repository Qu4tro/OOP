import java.util.Scanner;
import java.util.Arrays;

public class Ex07InsertAndRemove {

    public static void main(String[] args) {
        
        String[] words = getStringsUntil("zzz");
        printNonNull(words);
        String[] toBeErased = getStringsUntil("xxx");

        for (String str : toBeErased) {
            if (!(str == null))
                remove(words, Arrays.binarySearch(words, str));
        }

        printNonNull(words);

    }

    public static void printNonNull(String[] array){
    
        for (String str : array) {
            if (!(str == null))
                System.out.print(str + ", ");
        }

        System.out.println("");
    }

    public static String[] getStringsUntil(String delimiter){
    
        Scanner sc = new Scanner(System.in);
        String[] array = new String[1000];

        int i = 0;
        while (true){

            array[i] = sc.nextLine();
            
            if (array[i].equals(delimiter)){
                array[i] = null;
                break;
            }
            i += 1;
        }

        return array;
    }

    public static String[] remove(String[] array, int index){

        if (index < 0)
            return array;
    
        for(int i = array.length; i > index; i--) {
            array[i - 1] = array[i];
        }

        array[array.length] = null;
    
        return array;
    }
    
}
