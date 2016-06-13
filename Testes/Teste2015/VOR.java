import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by quatro on 6/3/16.
 */
public class VOR {

    HashMap<String, Equipa> equipas;

    public VOR() {
        equipas = new HashMap<>();
    }

    public VOR(HashMap<String, Equipa> equipas, HashMap<String, Barco> barcos) {
        setEquipas(equipas);
    }

    Barco getBarco(String idEquipa, String idBarco) throws InvalidBoatException {

        Equipa equipa;
        HashMap<String, Barco> barcos;

        if (equipas.containsKey(idEquipa)){
            equipa = equipas.get(idEquipa);
            barcos = (HashMap) equipa.getBarcos();
            if (barcos.containsKey(idBarco)) {
                return barcos.get(idBarco);
            } else {
                throw new InvalidBoatException();
            }
        } else {
            throw new InvalidBoatException();
        }
    }

    List<Barco> getBarcos(String idEquipa, double milhas){
        return equipas.get(idEquipa).getBarcos().values()
                                                .stream()
                                                .filter(barco -> barco.getMilhas() > milhas)
                                                .collect(Collectors.toList());
    }

    void removeBarco(String idEquipa, String idBarco) throws InvalidBoatException {
        Barco barco = getBarco(idEquipa, idBarco);
        Map<String, Barco> barcos = equipas.get(idEquipa).getBarcos();
        barcos.remove(barco);
        equipas.get(idEquipa).setBarcos(barcos);
    }



    public HashMap<String, Equipa> getEquipas() {
        return new HashMap<>(equipas);
    }

    public void setEquipas(HashMap<String, Equipa> equipas) {
        this.equipas = new HashMap<>(equipas);
    }

}

class InvalidBoatException extends Exception {
}