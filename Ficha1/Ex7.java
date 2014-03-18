public class Ex7
{
    public static void main(String args[])
    {
        System.out.printf("%d\n", ex());
    }

    public static long ex()
    {
        long begin = System.currentTimeMillis();
        inc10million();
        long end   = System.currentTimeMillis();

        return (end - begin);
    }

    private static void inc10million()
    {
        long x;
        for(x = 0; x < Math.pow(10, 7); x++);
    }








}
