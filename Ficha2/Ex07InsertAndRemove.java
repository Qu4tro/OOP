import java.util.Scanner;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Ex07InsertAndRemove {

    public static void main(String[] args) {
        
        String untilZZZ = getStringsUntil("zzz");
        String untilXXX = getStringsUntil("xxx");

        String[] words = untilZZZ.split("\n");
        String[] toErase = untilXXX.split("\n");

        for (String erasing : toErase) {
            words = removeElement(words, erasing);
        }

        System.out.println(Arrays.toString(words));

    }

    public static String getStringsUntil(String delimiter){
    
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String temp;

        while (true){

            temp = sc.nextLine();
            if (temp.equals(delimiter)){
                break;
            }
            sb.append(temp);
            sb.append("\n");
        }

        return sb.toString();
    }

    public static String[] removeElement(String[] original, String element){

          String[] n = new String[original.length - 1];
          int i;

          for(i = 0; !(original[i].equals(element)); i++) {

              if (i == original.length - 1){
                  return original;
              }

              n[i] = original[i];
          }
          for(; i < original.length - 1; i++) {
              n[i] = original[i + 1];
          }

          return n;
    }
}
