import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;


class Veiculo {}

class EntryVeiculo {

    String matricula;
    Veiculo veiculo;

    public EntryVeiculo(String key, Veiculo value){
        matricula = key;
        veiculo = value;
    }

    public String getKey(){
        return matricula; 
    }
    
    public Veiculo getValue(){
        return veiculo;
    }
}

public class MyMap {

    Set<EntryVeiculo> setOfPairs;
    EntryVeiculo existant = null;

    public void put(String key, Veiculo value){
        for (EntryVeiculo par: setOfPairs) {
            if (par.getKey().equals(key)){
                existant = par; 
                break;
            }
        }

        if (existant != null){
            setOfPairs.remove(existant);
        }

        setOfPairs.add(new EntryVeiculo(key, value));
    }

    public Veiculo get(String key){
      for (EntryVeiculo par: setOfPairs) {
            if (par.getKey().equals(key)){
                return par.getValue();
            }
        }

      return null;
    }

    public boolean containsKey(String key){
        for (EntryVeiculo par: setOfPairs) {
            if (par.getKey().equals(key)){
                return true;
            }
        }

        return false;

    }

    public Collection<Veiculo> values(){
        Collection<Veiculo> vals = new ArrayList<>();
        for (EntryVeiculo par: setOfPairs) {
            vals.add(par.getValue());
        }

        return vals;
    }
}
