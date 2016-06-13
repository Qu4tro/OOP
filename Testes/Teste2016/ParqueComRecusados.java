import java.util.*;
import java.lang.*;

interface IParque {

    public void entra(String cartao, String matricula) throws SemPermissaoException;

    public void sai(String matricula) throws VeiculoNaoExisteException;

    public boolean noParque(String matricula);

    public boolean equals();

}

class SemPermissaoException extends Exception {
}
class VeiculoNaoExisteException extends Exception {
}

public class ParqueComRecusados {

    Set<String> cartoesAutorizados;
    Set<String> carrosNoParque;
    Map<String, Set<String>> recusas;

    public void entra(String cartao, String matricula) throws SemPermissaoException{

        Set<String> cartoes;

        if (cartoesAutorizados.contains(cartao)){
            carrosNoParque.add(matricula);
        } else {
            cartoes = recusas.get(matricula);
            if (cartoes == null){
                cartoes = new HashSet<>();
            }
            cartoes.add(cartao);
            recusas.put(matricula, cartoes);
            throw new SemPermissaoException();
        }
    }

    public void sai(String matricula) throws VeiculoNaoExisteException{
        if (carrosNoParque.contains(matricula)){
            carrosNoParque.remove(matricula);
        } else {
            throw new VeiculoNaoExisteException();
        }
    }

    public boolean noParque(String matricula){
        return carrosNoParque.contains(matricula);
    }

    public boolean equals(Object other){

        if ( this == other ) 
            return true;

        if ( !(other instanceof ParqueComRecusados) ) 
            return false;

        ParqueComRecusados parque = (ParqueComRecusados) other;

        return carrosNoParque.equals(parque.getCarrosNoParque()) && recusas.equals(parque.getRecusas());
    }

    public Map<String, Set<String>> getRecusas(){
        return new HashMap<String, Set<String>>(recusas);
    }

    public Set<String> getCarrosNoParque(){
        return new HashSet<String>(carrosNoParque);
    }

    
}
