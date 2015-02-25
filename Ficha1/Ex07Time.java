public class Ex07Time {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        for (int inc = 0; inc < Math.pow(10, 7); inc++);

        long end = System.currentTimeMillis();

        System.out.println("Milliseconds to finish: " + (end - begin));
    }

}
