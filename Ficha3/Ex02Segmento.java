import java.lang.Double;

class Segmento{

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Segmento(){
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    public Segmento(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Segmento(Segmento s){
        this.x1 = s.getX1();
        this.x2 = s.getX2();
        this.y1 = s.getY1();
        this.y2 = s.getY2();
    }

    public double comprimento(){
        return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }

    public double declive(){
        return (this.y2 - this.y1) / (this.x2 - this.x1);
    }

    public String decliveString(){
        if (declive() > 0){
            return "Sobe";
        }
        if (declive() < 0){
            return "Desce";
        }
        return "Constante";
    }

    public void deslocar(double dx, double dy){
        this.x1 += dx;
        this.x2 += dx;

        this.y1 += dy;
        this.y2 += dy;
    }

    public double diametroCirculo(){
        return Math.PI*comprimento();
    }

    public String toString(){
        return "(" + x1 + ", " + y1 + ") -> (" + x2 + ", " + y2 + ")";
    }

    public double getX1(){
        return this.x1;
    }
    public double getX2(){
        return this.x2;
    }
    public double getY1(){
        return this.y1;
    }
    public double getY2(){
        return this.y2;
    }

    public void setX1(double x){
        this.x1 = x;
    }
    public void setX2(double x){
        this.x2 = x;
    }
    public void setY1(double y){
        this.y1 = y;
    }
    public void setY2(double y){
        this.y2 = y;
    }

    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())){
            return false;	
        }
        Segmento segmento = (Segmento) o;

        return (this.x1 == segmento.getX1() &&
                this.y1 == segmento.getY1() &&
                this.x2 == segmento.getX2() &&
                this.y2 == segmento.getY2());
    }

    public int hashCode(){
        int hash=7;
        hash = hash * 31 + Double.hashCode(this.x1);
        hash = hash * 31 + Double.hashCode(this.x2);
        hash = hash * 31 + Double.hashCode(this.y1);
        hash = hash * 31 + Double.hashCode(this.y2);
        return hash;
    }
    

    public Segmento clone(){
        return new Segmento(this.x1, this.y1, this.x2, this.y2);
    }




}

public class Ex02Segmento {

    public static void main(String[] args) {

        Segmento segmento = new Segmento(0, 0, 1, 1);
        System.out.println(segmento);
        System.out.println(segmento.comprimento());

        // TODO: better testing
        
    }

    
    
}
