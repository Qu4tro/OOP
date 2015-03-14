
class Rectangulo {

    class Point {

        private double x;
        private double y;

        Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double distanceTo(Point p){
            return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
        }

        public void move(double dx, double dy){
            this.x += dx;
            this.y += dy;
        }

        public double getX(){
            return this.x;
        }

        public double getY(){
            return this.y;
        }

        public Point clone(){
            return new Point(x, y);
        }

        public String toString(){
            return "(" + this.x + ", " + this.y + ")";
        }
        

    }

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    Rectangulo(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1, y1); this.p2 = new Point(x2, y1); 
        this.p3 = new Point(x1, y2); this.p4 = new Point(x2, y2); 
    }

    Rectangulo(Point p1, Point p4) {
        this.p1 = p1;                              this.p2 = new Point(p4.getX(), p1.getY()); 
        this.p3 = new Point(p1.getX(), p4.getY()); this.p4 = p4;
    }

    public double baseLength(){
        return p1.distanceTo(p2);
    }
    public double diagonalLength(){
        return p1.distanceTo(p4);
    }
    public double verticalLength(){
        return p1.distanceTo(p3);
    }

    public double area(){
        return verticalLength()*baseLength();
    }
    public double perimeter(){
        return 2*(verticalLength()+baseLength());
    }

    public void move(double dx, double dy){
        this.p1.move(dx, dy);
        this.p2.move(dx, dy);
        this.p3.move(dx, dy);
        this.p4.move(dx, dy);
    }

    public Rectangulo clone(){
        return new Rectangulo(p1.clone(), p4.clone());
    }

    public String toString(){
        return p1.toString() + p4.toString();
    }

}

public class Ex05Rectangulo {

    public static void main(String[] args) {

        // TODO: Equals and Testing on Main
        
    }
    
}
