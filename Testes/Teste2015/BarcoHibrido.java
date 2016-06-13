/**
 * Created by quatro on 6/3/16.
 */
public class BarcoHibrido extends Barco {
    private double potenciaElectrica;
    private double capacidadeElectrica;
    private double autonomiaElectrica;

    public BarcoHibrido(){
        potenciaElectrica = 0;
        capacidadeElectrica = 0;
        autonomiaElectrica = 0;
    }

    public BarcoHibrido(double potenciaElectrica, double capacidadeElectrica, double autonomiaElectrica){
        this.potenciaElectrica = potenciaElectrica;
        this.capacidadeElectrica = capacidadeElectrica;
        this.autonomiaElectrica = autonomiaElectrica;

    }

    public BarcoHibrido(BarcoHibrido d){
            this.potenciaElectrica = d.getPotencia();
            this.capacidadeElectrica = d.getCapacidade();
            this.autonomiaElectrica = d.getAuto();
    }

    public double getPotencia(){
        return this.potenciaElectrica;
    }

    public double getCapacidade(){
        return this.capacidadeElectrica;
    }

    public String toString() {
        return "BarcoHibrido{" +
                "potenciaElectrica=" + potenciaElectrica +
                ", capacidadeElectrica=" + capacidadeElectrica +
                ", autonomiaElectrica=" + autonomiaElectrica +
                '}';
    }

    public double getAuto(){
        return this.autonomiaElectrica;
    }

    }

}


