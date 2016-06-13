/**
 * Created by quatro on 6/3/16.
 */

import java.util.*;
import java.lang.*;

public class Mensagem extends Comunicação {
    private String assunto;
    private String texto;

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
