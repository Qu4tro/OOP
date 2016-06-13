import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream ;

@SuppressWarnings("serial")
class ReceitaInexistenteException extends Exception{
    public ReceitaInexistenteException(String message){
        super(message);
    }

    
}

public class LivroDeReceitas {

    Map<String, Receita> receitas;

    public int totalCalorias(String nomeReceita) throws ReceitaInexistenteException {

        int total = 0;
        Receita receita;

        for (String nome : receitas.keySet()) {
            if (nome.equals(nomeReceita)){
                receita = receitas.get(nome);

                for (Ingrediente ingrediente : receita.getIngredientes()) {
                    total += ingrediente.getCalorias();
                }
            
            }
        }
    
        throw new ReceitaInexistenteException("Receita não encontrada");
    }

    public Map<String, Set<String>> receitasPorIngrediente(){

        Set<String> ingredientes = new TreeSet<String>();
        Map <String, Set<String>> receitasIngrediente = new HashMap<String, Set<String>>();

        for (String nome : receitas.keySet()) {
            for (Ingrediente ing : receitas.get(nome).getIngredientes()) {

                if (!(receitasIngrediente.containsKey(ing.getNome()))){
                    receitasIngrediente.put(ing.getNome(), new TreeSet<String>());
                }
                receitasIngrediente.get(ing.getNome()).add(nome);
            }
        }
    
        return receitasIngrediente;
    }

    public void gravaObj(String filename, int calorias){

        Set<Receita> receitasCaloricas = new TreeSet<Receita>();
        Receita receita;
        int totalCalorias = 0;

        for (String nome : receitas.keySet()) {
            receita = receitas.get(nome);
            totalCalorias = 0;

            for(Ingrediente ing: receita.getIngredientes()){
                totalCalorias += ing.getCalorias();
            }

            if (totalCalorias >= calorias){
                receitasCaloricas.add(receita);
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(receitasCaloricas);
            oos.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
