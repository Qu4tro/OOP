public class CEO extends Empregado {

    private static double salDia = 250.00;
    private String codigo;
    private String nome;
    private int dias;

    public CEO(){
        super();
    }

    public CEO(CEO ceo){
        super(ceo);
    }
    
    public String getNIF(){
        return "NIF do CEO";
    
    }

    public double salario(){

        return getSalDia() * dias;
    }

    public String toString(){
        return nome + " | CEO";
    
    }

    public CEO clone(){
        return new CEO(this);
    }
    
}
