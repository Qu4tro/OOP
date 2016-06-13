/**
 * Created by quatro on 6/3/16.
 */

import java.util.*;
import java.lang.*;

public class Comunicação {

    private String remetente;
    private String destinatario;
    private GregorianCalendar data;

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public void setData(GregorianCalendar data) {
        this.data = data;
    }
}
