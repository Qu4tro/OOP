public class Van extends Veiculo {

    double capacidadeUtil;


    public double custoPorContrato(Contratavel ct){
        return capacidadeUtil * getCustoPorKm() * ct.getDistancia();
    }


    
}
