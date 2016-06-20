/**
 * Created by quatro on 6/3/16.
 */

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class MsgMap {

    private TreeMap<String, ArrayList<Mensagem>> msgBox;

    public MsgMap(MsgMap mm){
        msgBox = mm.getMsgBox();
    }

    public int tamanho(){
        return msgBox.size();
    }

    public int quantosDe(String remetente){
        return (int) msgBox.values().stream()
                                    .flatMap(l -> l.stream())
                                    .filter(m -> m.getRemetente().equals(remetente))
                                    .count();
    }

    public void antiSpam(String palavra){

        for(Map.Entry<String, ArrayList<Mensagem>> entry: msgBox.entrySet()){
            msgBox.put(entry.getKey(),
                       (ArrayList<Mensagem>) entry.getValue().stream()
                                                             .filter(m -> !(m.getTexto().contains(palavra)))
                                                             .collect(Collectors.toList()));
        }
    }

    public Map<String, List<Mensagem>> msgDeRemetente(){
        ;

        return null;
    }


    public TreeMap<String, ArrayList<Mensagem>> getMsgBox() {
        return new TreeMap<>(msgBox);
    }

    public void setMsgBox(TreeMap<String, ArrayList<Mensagem>> msgBox) {
        this.msgBox = new TreeMap<>(msgBox);
    }
}
