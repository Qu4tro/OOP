import java.util.*;
import java.lang.*;

class Empregado {
}
class Motorista extends Empregado {
    double nKms;

    double getNKms(){
        return nKms;
    }
}

public class Motoristas {

    Map<String, Empregado> empregados;

    public double qtsKmsTotal(){
        return this.empregados.values()
                              .stream()
                              .filter(e -> e instanceof Motorista)
                              .mapToDouble(e -> ((Motorista) e).getNKms())
                              .sum();
    }

    public double qtsKmsTotal2(){
        double total = 0;

        for (Empregado e : this.empregados.values()) {
            if (e instanceof Motorista) {
                total += ((Motorista) e).getNKms();
            }
        }

        return total;
    }
}
