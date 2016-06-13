import java.util.*;
import java.lang.*;

public class Equipa {

    private String nome;
    private Map<String, Barco> barcos;

    public Equipa() {
        nome = "";
        barcos = new HashMap<>();
    }

    public Equipa(String nome, Map<String, Barco> barcos) {
        this.nome = nome;
        setBarcos(barcos);
    }

    double totalEmProva(String idBarco){
        return barcos.get(idBarco).getEtapas().stream()
                                              .map(RegistoEtapa::horasEtapa)
                                              .reduce(new Double(0), (a, b) -> a + b);

    }

    double registoMaisLongo(){
        double max = 0;
        for(Barco b : barcos.values()){
            if(this.totalEmProva(b.getId())) > max){
                max = totalEmProva(b.getId());
            }
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, Barco> getBarcos() {
        return new HashMap<>(barcos);
    }

    public void setBarcos(Map<String, Barco> barcos) {
        this.barcos = new HashMap<>(barcos);
    }
}
