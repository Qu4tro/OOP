
public class Stand {
    //variáveis de instância
    private String nomeStand;
    private Veiculo[] carros;
    private int nVeiculos;   //número veículos no stand
    //capacidade do stand (em número de veículos)
    private int capacidade;
    //capacidade inicial do Stand: valor por omissão
    public static final int capacidade_inicial = 10;

  //construtores
    public Stand() {
        this.nomeStand = new String();
        this.carros = new Veiculo[capacidade_inicial];
        this.capacidade = capacidade_inicial;
        this.nVeiculos = 0;
  }

    public Stand(String nome, int capacidade) {
        this.nomeStand = nome;
        this.carros = new Veiculo[capacidade];
        this.capacidade = capacidade;
        this.nVeiculos = 0;
  }

    public Stand(Stand umStand) {
        this.nomeStand  = umStand.getNomeStand();
        this.carros     = umStand.getCarros();
        this.capacidade = umStand.getCapacidade();
        this.nVeiculos  = umStand.getNVeiculos();
  }

    public void insereVeiculo(Veiculo v) {
        if (this.nVeiculos < this.capacidade)
            carros[nVeiculos++] = v;
    }


    public boolean existeVeiculo(Veiculo v) {
        for(int i = 0; i < this.nVeiculos; i++)
            if (v.equals(this.carros[i]))
                return true;
        return false;
    }

    public boolean existeVeiculoPorMatricula(String matricula) {
        for(int i = 0; i < this.nVeiculos; i++)
            if (this.carros[i].getMatricula().equals(matricula))
                return true;
        return false;
    }


    public Veiculo veiculoComMaisKms() {
        Veiculo v = this.carros[0];
        double maxKM = v.getQuilometragem();

        for(int i = 1; i < this.nVeiculos; i++)
            if (this.carros[i].getQuilometragem() > maxKM){
                v = this.carros[i];
                maxKM = v.getQuilometragem();
                }

        return v.clone();
    }

    public Veiculo veiculoMaisGastador() {
        Veiculo v = this.carros[0];
        double maxConsumo = v.getConsumoMedio();

        for(int i = 1; i < this.nVeiculos; i++)
            if (this.carros[i].getConsumoMedio() > maxConsumo){
                v = this.carros[i];
                maxConsumo = v.getConsumoMedio();
                }

        return v.clone();
    }


    public double totalKmsTodosVeiculos() {
        double kms = 0;
        for(int i = 0; i < this.nVeiculos; i++)
            kms += this.carros[i].getQuilometragem();

        return kms;
    }


    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (( o == null) || (this.getClass() != o.getClass()))
            return false;
        Stand s = (Stand) o;
        return (this.nomeStand == s.getNomeStand());
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("Stand: ");
        s.append(this.nomeStand);

        return s.toString();
    }

    public Stand clone() {
        Stand s = new Stand(this);
        return s;
    }

    public String getNomeStand()
    	{ return this.nomeStand; }

    public void setNomeStand(String nomeStand)
    	{ this.nomeStand = nomeStand; }

    public Veiculo[] getCarros()
    	{ return this.carros.clone(); }

    public Veiculo getCarros(int index)
    	{ return this.carros[index]; }

    public void setCarros(Veiculo[] carros)
    	{ this.carros = carros.clone(); }

    public void setCarros(Veiculo carros, int index)
    	{ this.carros[index] = carros; }

    public int getNVeiculos()
    	{ return this.nVeiculos; }

    public void setNVeiculos(int nVeiculos)
    	{ this.nVeiculos = nVeiculos; }

    public int getCapacidade()
    	{ return this.capacidade; }

    public void setCapacidade(int capacidade)
    	{ this.capacidade = capacidade; }

    public int getCapacidade_inicial()
    	{ return this.capacidade_inicial; }
}
