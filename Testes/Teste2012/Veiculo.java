import java.util.*;
import java.lang.*;

public abstract class Veiculo {

    private String matricula;
    private ArrayList<Contratavel> servicosContratados;
    private double custoPorKm;

    public abstract double custoPorContrato(Contratavel ct);

   
    public  ArrayList<Contratavel> getServicosContratados(){
        return servicosContratados; 
    }

    public double getCustoPorKm(){
        return custoPorKm; 
    }


}
