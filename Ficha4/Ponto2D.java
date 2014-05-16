
/**
 * Pontos descritos como duas coordenadas reais.
 *
 * @author F. Mário Martins
 * @version 2005
 */
import static java.lang.Math.abs;
public class Ponto2D {

  // Variáveis de Instância
   private double x, y;

   // Construtores usuais
   public Ponto2D(double cx, double cy) { x = cx; y = cy; }
   public Ponto2D(){ this(0, 0); }
   public Ponto2D(Ponto2D p) { x = p.getX(); y = p.getY(); }

   // Métodos de Instância
   public double getX() { return x; }
   public double getY() { return y; }

   /** incremento das coordenadas */
   public void incCoord(double dx, double dy) {
      x += dx; y += dy;
   }
   /** decremento das coordenadas */
   public void decCoord(double dx, double dy) {
      x -= dx; y -= dy;
   }
   /** soma as coordenadas do ponto parâmetro ao ponto receptor */
   public void somaPonto(Ponto2D p) {
      x += p.getX(); y += p.getY();
   }
   /** soma os valores parâmetro e devolve um novo ponto */
   public Ponto2D somaPonto(double dx, double dy) {
     return new Ponto2D(x += dx, y+= dy);
   }
   /** determina se um ponto é simétrico (dista do eixo dos XX o
   mesmo que do eixo dos YY */
   public boolean simetrico() {
     return abs(x) == abs(y);
   }
   /** verifica se ambas as coordenadas são positivas */
   public boolean coordPos() { return x > 0 && y > 0; }

   // Métodos complementares usuais

   /** Verifica se os pontos são iguais */
   public boolean igual(Ponto2D p) {
      if (p != null) return x == p.getX() && y == p.getY();
      else return false;
   }

   /** outra versão de igual(Ponto2D p) */
   public boolean igual1(Ponto2D p) {
     return (p == null) ? false : x == p.getX() && y == p.getY();
   }

   /** método equals() standard - recebe Object como parâmetro */
   public boolean equals(Object obj) {
      if(this == obj) return true;  // é o próprio
      if((obj == null) || (this.getClass() != obj.getClass())) return false;
      Ponto2D p = (Ponto2D) obj;
      return x == p.getX() && y == p.getY();
   }

   /** Converte para uma representação textual  */
   public String toString() {
     return "Pt2D = " + x + ", " + y + "\n";
   }

   /** Cria e devolve uma cópia "deep" do ponto receptor */
   public Ponto2D clone() { return new Ponto2D(this); }

}

