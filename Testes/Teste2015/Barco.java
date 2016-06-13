import java.util.*;
import java.lang.*;

class Pessoa {

}

public class Barco {

    private String id;
    private double milhas;
    private String categoria;
    private double autonomia;
    private Pessoa skipper;
    private Set<Pessoa> tripulantes;
    private List<RegistoEtapa> etapas;


    public Barco() {
        id = "";
        milhas = 0;
        categoria = "";
        autonomia = 0;
        skipper = null;
        tripulantes = new TreeSet<>();
        etapas = new LinkedList<>();

    }

    public Barco(String id, double milhas, String categoria, double autonomia, Pessoa skipper, Set<Pessoa> tripulantes, List<RegistoEtapa> etapas) {
        this.id = id;
        this.milhas = milhas;
        this.categoria = categoria;
        this.autonomia = autonomia;
        this.skipper = skipper;
        this.tripulantes = tripulantes;
        this.etapas = etapas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMilhas() {
        return milhas;
    }

    public void setMilhas(double milhas) {
        this.milhas = milhas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public Pessoa getSkipper() {
        return skipper;
    }

    public void setSkipper(Pessoa skipper) {
        this.skipper = skipper;
    }

    public Set<Pessoa> getTripulantes() {
        return new TreeSet<>(tripulantes);
    }

    public void setTripulantes(Set<Pessoa> tripulantes) {
        this.tripulantes = new TreeSet<>(tripulantes);
    }

    public List<RegistoEtapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<RegistoEtapa> etapas) {
        this.etapas = etapas;
    }
}
