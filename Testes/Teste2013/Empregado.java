import java.lang.Float;

public abstract class Empregado implements Contribuinte {

    private static double salDia = 50.00;
    public static double getSalDia() {
        return salDia;
    }

    private String codigo;
    private String nome;
    private int dias;

    public Empregado(Empregado empregado){

        codigo = empregado.getCod();
        nome = empregado.getNome();
        dias = empregado.getDiasTrabalho();
    
    }

    public Empregado(){
        codigo = "";
        nome = "";
        dias = 0;
    }

    public String getCod(){
        return codigo; 
    }
    public String getNome(){
        return nome; 
    }

    public int getDiasTrabalho(){
        return dias; 
    }

    public String toString(){
        return nome + " | Empregado #" + codigo;
    }


    public double salario(){
        return salDia * dias;
    }

    public abstract Empregado clone();
    
}
