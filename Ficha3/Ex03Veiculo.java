import java.lang.StringBuilder;

class Veiculo {

    private double quilometragem;
    private String matricula;
    private double capacidade;
    private double deposito;
    private double consumoMedio;
    private int nViagens;

    public Veiculo() {
        this.matricula     = "";
        this.quilometragem = 0.0;
        this.capacidade    = 0.0;
        this.deposito      = 0.0;
        this.consumoMedio  = 0.0;
        this.nViagens      = 0;
    }

    public Veiculo(String matricula, double capacidade) {
        this.matricula     = matricula;
        this.quilometragem = 0.0;
        this.capacidade    = capacidade;
        this.deposito      = 0.0;
        this.consumoMedio  = 0.0;
        this.nViagens      = 0;
    }


    public Veiculo(Veiculo v) {
        this.quilometragem = v.getQuilometragem();
        this.matricula     = v.getMatricula();
        this.capacidade    = v.getCapacidade();
        this.deposito      = v.getDeposito();
        this.consumoMedio  = v.getConsumoMedio();
        this.nViagens      = v.getNViagens();
    }

    public double quantosQuilometros() {
        return (100 * this.deposito) / this.consumoMedio;
    }

    public void novaViagem(double quilometros) {
        this.quilometragem += quilometros;
        this.nViagens++;
        this.deposito -= (quilometros * this.consumoMedio)/100;
    }

    public boolean naReserva() {
        int reserva = 10;
        return this.deposito <= reserva;
    }

    public double custoMedioPorKM(double custoMedio) {
        return (this.consumoMedio/100) * custoMedio;
    }

    public double custoTotal(double custoMedio) {
        return custoMedioPorKM(custoMedio)*this.quilometragem;
    }

    public void encherDeposito(double L) {
        this.deposito += L;
        if (this.deposito > this.capacidade)
            this.deposito = this.capacidade;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("Veiculo: ");
        s.append(this.matricula);

        return s.toString();
    }

    public Veiculo clone() {
        Veiculo v = new Veiculo(this);
        return v;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (( o == null) || (this.getClass() != o.getClass()))
            return false;
        Veiculo v = (Veiculo) o;
        return (this.matricula == v.getMatricula());
    }

    public int hashCode(){
        int hash = 7;
        hash = hash * 31 + this.matricula.hashCode();
        return hash;
    }
    
    public double getQuilometragem(){ 
        return quilometragem; 
    }
    public void setQuilometragem(double quilometragem){
        this.quilometragem = quilometragem;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula; 
    }
    public double getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }
    public double getDeposito(){
        return deposito;
    }
    public void setDeposito(double deposito){
        this.deposito = deposito;
    }
    public double getConsumoMedio(){
        return consumoMedio;
    }
    public void setConsumoMedio(double consumoMedio){
        this.consumoMedio = consumoMedio;
    }
    public int getNViagens(){
        return nViagens;
    }
    public void setNViagens(int nViagens){
        this.nViagens = nViagens;
    }
}

public class Ex03Veiculo {
    
    public static void main(String[] args) {

        // TODO: Testing on Main
        
    }
}
