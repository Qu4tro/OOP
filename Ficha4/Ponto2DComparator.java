import java.util.Comparator;
// import java.io.Serializable;

public class Ponto2DComparator implements Comparator<Ponto2D>
// , Serializable
{

    public int compare(Ponto2D p1, Ponto2D p2)
    {
        if (p1.getX() < p2.getX()) return -1;
        if (p1.getX() > p2.getX()) return 1;
        return 0;
    }


}

