import java.lang.StringBuilder;

class Pixel{

    private int x;
    private int y;
    private int cor;

    Pixel(int x1, int y1, int cor1){
    
        this.x = x1;
        this.y = y1;

        if (cor1 < 0){
            this.cor = 0;
        } else if (cor1 > 255) {
            this.cor = 255;
        } else {
            this.cor = cor1;
        }
    
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

    public boolean equals(){
        return true;
    }

    public Pixel clone(){
        return null;
    }


}

public class Ex01Pixel {

    public static void main(String[] args) {

        Pixel pixel = new Pixel(4, 4, 4);
        System.out.print(pixel);
    }
    
}
