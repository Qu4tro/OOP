import java.util.TreeSet;

public class ConjuntosPontosTree
{
    private TreeSet<Ponto2D> plano;

	public ConjuntosPontosTree() {
	    this.plano = new TreeSet<Ponto2D>(new Ponto2DComparator());
	}

    public void inserePonto(Ponto2D p)
    { this.plano.add(p.clone()); }

}

