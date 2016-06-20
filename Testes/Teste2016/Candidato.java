class Candidato{

    String nome;
    int idade;

    public Candidato(){

    }

    public Candidato clone(){
        return this; 
    }

    public boolean equals(Candidato c){
        return true;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade; 
    }

}
