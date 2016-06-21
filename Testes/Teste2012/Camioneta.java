public class Camioneta extends Veiculo {

    String nomeMotorista;
    double peso;
    double fatorPoluicao;

    public double custoPorContrato(Contratavel ct){
        return getCustoPorKm() * ct.getDistancia() * fatorPoluicao;
    }

    
}
