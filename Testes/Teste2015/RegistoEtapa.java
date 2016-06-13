import java.util.GregorianCalendar;

/**
 * Created by quatro on 6/3/16.
 */
public class RegistoEtapa {

    GregorianCalendar inicio;
    GregorianCalendar fim;
    String nome;
    int milhasPercorridas;

    public RegistoEtapa(){
        inicio = new GregorianCalendar();
        fim = new GregorianCalendar();
        nome = "";
        milhasPercorridas = 0;
    }

    public RegistoEtapa(GregorianCalendar inicio, GregorianCalendar fim, String nome, int milhasPercorridas) {
        this.inicio = inicio;
        this.fim = fim;
        this.nome = nome;
        this.milhasPercorridas = milhasPercorridas;
    }

    public double horasEtapa(){
        long startTime = inicio.getTimeInMillis();
        long endTime = fim.getTimeInMillis();
        long diffTime = endTime - startTime;
        return (double) diffTime / (1000 * 3600);
    }

    public GregorianCalendar getInicio() {
        return inicio;
    }

    public void setInicio(GregorianCalendar inicio) {
        this.inicio = inicio;
    }

    public GregorianCalendar getFim() {
        return fim;
    }

    public void setFim(GregorianCalendar fim) {
        this.fim = fim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMilhasPercorridas() {
        return milhasPercorridas;
    }

    public void setMilhasPercorridas(int milhasPercorridas) {
        this.milhasPercorridas = milhasPercorridas;
    }
}
