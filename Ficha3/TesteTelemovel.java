public class TesteTelemovel
{
    public static void main(String[] args)
    {
        Telemovel nokia;
        Telemovel iphone;

        nokia = new Telemovel();
        nokia.setModelo("Nokia 900");
        nokia.setPreco(123.4);
        nokia.setMemory(1);

        nokia.aumentaPreco(20);

        iphone = new Telemovel(nokia);

        System.out.println("Resultado Nokia " + nokia.toString());
        System.out.println("Resultado IPhone " + iphone.toString());
    }


}
