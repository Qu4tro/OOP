class Complexo {

    private double a;
    private double b;

    Complexo(double a, double b){
        this.a = a;
        this.b = b;
    }

    public static Complexo add(Complexo c1, Complexo c2){
        double newA = c1.getReal() + c2.getReal();
        double newB = c1.getImaginary() + c2.getImaginary();
        return new Complexo(newA, newB);
    }

    public static Complexo multiply(Complexo c1, Complexo c2){
        double newA = (c1.getReal() * c2.getReal()) - (c1.getImaginary() * c2.getImaginary());
        double newB = (c1.getImaginary() * c2.getReal()) + (c1.getReal() * c2.getImaginary());
        return new Complexo(newA, newB);
    }

    public static Complexo conjugate(Complexo c){
        return new Complexo(c.getReal(), -c.getImaginary());
    }

    public String polar(){

        double r = Math.sqrt(a*a + b*b);
        double angle = Math.atan(b / a);

        return "z = " + r + "(" + Math.cos(angle) + " + " + Math.sin(angle) + "i)";
    }

    public String toString(){
        return "z = " + a + " + " + b + "i";
    }

    public double getReal(){
        return a;
    }
    
    public double getImaginary(){
        return b;
    }
    
}

public class Ex07Complexo{
       
    public static void main(String[] args) {

        // TODO: Equals, testing
        
    }
    
}
