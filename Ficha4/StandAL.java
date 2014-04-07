
import java.util.ArrayList;

public class StandAL {
    private String nomeStand;
    private ArrayList<Veiculo> carros;
    private int capacidade;
    public static final int capacidade_inicial = 10;

  //construtores
    public StandAL() {
        this.nomeStand = new String();
        this.carros = new ArrayList<Veiculo>(this.capacidade_inicial);
        this.capacidade = capacidade_inicial;
  }

    public StandAL(String nome, int capacidade) {
        this.nomeStand = nome;
        this.carros = new ArrayList<Veiculo>(capacidade);
        this.capacidade = capacidade;
  }

    public StandAL(StandAL umStand) {
        this.nomeStand  = umStand.getNomeStand();
        this.carros     = umStand.getCarros();
        this.capacidade = umStand.getCapacidade();
  }

    // public void insereVeiculo(Veiculo v) {
    //     if (this.nVeiculos < this.capacidade)
    //         carros[nVeiculos++] = v;
    // }


    public boolean existeVeiculo(Veiculo v1) {
        for(Veiculo v2: this.carros)
            if (v1.equals(v2))
                return true;
        return false;
    }

    public boolean existeVeiculoPorMatricula(String matricula) {
        for(Veiculo v2: this.carros)
            if (matricula.equals(v2.getMatricula()))
                return true;
        return false;
    }


    public Veiculo veiculoComMaisKms() {
        Veiculo veiculoComMaisKm = new Veiculo();
        double maxKM = 0;

        for(Veiculo v: this.carros)
            if (v.getQuilometragem() >= maxKM){
                veiculoComMaisKm = v;
                maxKM = v.getQuilometragem();
                }

        return veiculoComMaisKm.clone();
    }

    public Veiculo veiculoMaisGastador() {
        Veiculo veiculoMaisGastador = new Veiculo();
        double maxConsumo = 0;

        for(Veiculo v: this.carros)
            if (v.getConsumoMedio() > maxConsumo){
                veiculoMaisGastador = v;
                maxConsumo = v.getConsumoMedio();
                }

        return veiculoMaisGastador.clone();
    }


    // public double totalKmsTodosVeiculos() {
    //     double kms = 0;
    //     for(int i = 0; i < this.nVeiculos; i++)
    //         kms += this.carros[i].getQuilometragem();

    //     return kms;
    // }


    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (( o == null) || (this.getClass() != o.getClass()))
            return false;
        StandAL s = (StandAL) o;
        return (this.nomeStand == s.getNomeStand());
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("Stand: ");
        s.append(this.nomeStand);

        return s.toString();
    }

    public StandAL clone() {
        StandAL s = new StandAL(this);
        return s;
    }


    public String getNomeStand()
    	{ return this.nomeStand; }

    public void setNomeStand(String nomeStand)
    	{ this.nomeStand = nomeStand; }

    public int getCapacidade()
    	{ return this.capacidade; }

    public void setCapacidade(int capacidade)
    	{ this.capacidade = capacidade; }

    public int getCapacidade_inicial()
    	{ return this.capacidade_inicial; }

    public ArrayList<Veiculo> getCarros()
    {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>(this.capacidade);
        for(Veiculo v: this.carros)
            veiculos.add(v.clone());

        return veiculos;
    }

}
