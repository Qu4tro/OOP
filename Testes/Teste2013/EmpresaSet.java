import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

import java.lang.Double;

class SalarioComparator implements Comparator<Empregado>{
    public int compareTo(Empregado e1, Empregado e2){
        return Double.compare(e2.salario(), e1.salario());
    }
}

public class EmpresaSet {

    TreeSet<Empregado> empregados;

    public EmpresaSet(){
        empregados = new TreeSet<Empregado>();
    }

    public boolean existeEmpregado(String cod){

        for(Empregado empregado: empregados){
            if (empregado.getCod().equals(cod)){
                return true; 
            }
        
        }

        return false;
    }

    public Empregado getEmpregado(String cod){
    
        for(Empregado empregado: empregados){
            if (empregado.getCod().equals(cod)){
                return empregado.clone(); 
            }
                
        }

        return null;
    }

    public void addEmpregado(Empregado e){
        empregados.add(e);
    }

    public Iterator<Empregado> listaPorOrdemDecrescenteSalario(){

        SalarioComparator comp = new SalarioComparator();
        TreeSet<Empregado> ordenada = new TreeSet<Empregado>(comp);

        ordenada.addAll(empregados);
    
        return ordenada.iterator();
    }

    
}


