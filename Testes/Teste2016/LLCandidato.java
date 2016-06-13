class Candidato{
    public Candidato(){
    }
    public Candidato clone(){
        return this; 
    }
    public boolean equals(Candidato c){
        return true ;
    }
}

class CandidatoException extends Exception {}

public class LLCandidato {

    Candidato c;
    LLCandidato next;

    public LLCandidato(){
        c = new Candidato();
        next = null;
    }

    public LLCandidato(Candidato c){
        this.c = c;
        next = null;
    }


    public int size(){
        return 1 + next.size();
    }

    public void add(Candidato c){

        if (next == null){
            next = new LLCandidato(c);
        } else {
            next.add(c);
        }
    }

    public Candidato get(int i) throws CandidatoException {

        if (i == 0){
            return c; 
        }

        if (next == null){
            throw new CandidatoException();
        } else {
            return next.get(i - 1);
        }
    }

    public boolean equals(Object other){

        if ( this == other ) 
            return true;

        if ( !(other instanceof ParqueComRecusados) ) 
            return false;

        LLCandidato ll = (LLCandidato) other;

        return c.equals(ll.getCandidato()) && next.equals(ll.getNext());
    }

    public Candidato getCandidato(){
        return c.clone() ;
    }

    public LLCandidato getNext(){
        return next ;
    }


    
}
