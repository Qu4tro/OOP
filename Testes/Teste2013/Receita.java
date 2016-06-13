import java.util.Set;

public class Receita {

    String nome;
    String descricao;
    Set<Ingrediente> ingredientes;
    String instrucoes;
    
    public Receita(String nome, String descricao, Set<Ingrediente> ingredientes, String instrucoes){

        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
        this.instrucoes = instrucoes;
    }

    public Set<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    
}

