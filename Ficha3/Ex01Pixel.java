import java.lang.StringBuilder;

class Pixel{

    private int x;
    private int y;
    private int cor;

    public Pixel(){
        this.x = 0;
        this.y = 0;
        this.cor = 0;
    }

    public Pixel(int x1, int y1, int cor1){
        this.x = x1;
        this.y = y1;
        changeColor(cor1);
    }

    Pixel(Pixel pixel){
        this.x = pixel.getX();
        this.y = pixel.getY();
        this.cor = pixel.getColor();
    }

    public void moveLeft(int value){
        this.x -= value;
    }

    public void moveRight(int value){
        this.x += value;
    }

    public void moveDown(int value){
        this.y -= value;
    }

    public void moveUp(int value){
        this.y += value;
    }

    public void changeColor(int color){
        if (color < 0){
            this.cor = 0;
        } else if (color > 255) {
            this.cor = 255;
        } else {
            this.cor = color;
        }
    }

    public void setX(int x1){
        this.x = x1;
    }

    public void setY(int y1){
        this.y = y1;
    }

    public int getColor(){
        return this.cor;
    }
    
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String getColorName(){

        if (this.cor <= 2){
            return "Preto";
        }
        if (this.cor <= 52){
            return "Cinza";
        }
        if (this.cor <= 102){
            return "Azul";
        }
        if (this.cor <= 152){
            return "Verde";
        }
        if (this.cor <= 202){
            return "Vermelho";
        }
        if (this.cor <= 252){
            return "Amarelo";
        }

        return "Branco";
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append("Pixel: ");
        sb.append("(");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(")\t\t");
        sb.append(getColorName());
        sb.append("\n");
        
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())){
            return false;	
        }
        Pixel pixel = (Pixel) o;
        
        return (this.x == pixel.getX() && 
                this.y == pixel.getY() &&
                this.cor == pixel.getColor());
    }

    public int hashCode(){
        int hash=7;
        hash = hash*31+this.x;
        hash = hash*31+this.y;
        hash = hash*31+this.cor;
        return hash;
    }
    
    

    public Pixel clone(){
        return new Pixel(this);
    }


}

public class Ex01Pixel {

    public static void main(String[] args) {

        Pixel pixel1 = new Pixel(4, 4, 4);
        Pixel pixel2;
        pixel2 = pixel1.clone();
        System.out.print(pixel1);
        System.out.print(pixel2);
        System.out.print(pixel1.equals(pixel2));

        // TODO: Better testing 
    }
    
}
