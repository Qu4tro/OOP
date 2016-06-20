import java.util.*;
import java.lang.*;

public class Empresa {

    private String nomeEmpresa;
    private TreeMap<String, Veiculo> veiculos;

    public double valorTodosContratos(){

        double total = 0;
        for (Veiculo v: veiculos.values()) {
            for (Contratavel c: v.getServicosContratados()) {
                total += v.custoPorContrato(c);
            }
            
        }
    
        return total;
    }

    public Map<String, ArrayList<Veiculo>> veiculosPorCliente(){

        ArrayList<Veiculo> temp;
        Map<String, ArrayList<Veiculo>> veiculosPorCliente = new HashMap<>();


        for (Veiculo v: veiculos.values()) {
            for (Contratavel c: v.getServicosContratados()) {
                temp = veiculosPorCliente.get(c.getCliente());
                if (temp == null){
                    temp = new ArrayList<>();
                } 
                temp.add(v);
                veiculosPorCliente.put(c.getCliente(), temp);
            }
        }

        return veiculosPorCliente;
    }

    public String veiculoComMaisKms(){
        return veiculos.firstKey();
    }

    public boolean existeServicoComDistanciaMaiorQue(double dist){
        return veiculos.firstEntry()
                       .getValue()
                       .getServicosContratados()
                       .stream()
                       .mapToDouble(c -> c.getDistancia())
                       .sum() > dist;
    }
    
}
