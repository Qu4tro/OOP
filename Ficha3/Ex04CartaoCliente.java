class CartaoCliente {

    private float totalValue;
    private String code;
    private String owner;
    public int pointsPercentage;
    private int points;

    CartaoCliente(){
        this.totalValue = 0;
        this.code = "";
        this.owner = "";
        this.pointsPercentage = 0;
        this.points = 0;
    }

    CartaoCliente(String code, String owner){
        this.totalValue = 0;
        this.code = code;
        this.owner = owner;
        this.pointsPercentage = 10;
        this.points = 0;
    }

    CartaoCliente(CartaoCliente cc){
        this.totalValue = cc.getTotalValue();
        this.code = cc.getCode();
        this.owner = cc.getOwner();
        this.pointsPercentage = cc.getPointsPercentage();
        this.points = cc.getPoints();
    }


    public void withdrawPoints(int P){
        this.points -= P;
    }

    public void setOwner(String newOwner){
        this.owner = newOwner;
    }

    public void setPointsPercentage(int newPointsPercentage){
        this.pointsPercentage = newPointsPercentage;
    }

    public void joinPoints(CartaoCliente cc){
        int newPoints = cc.getPoints();
        cc.withdrawPoints(newPoints);
        this.points += newPoints;
    }

    public void newBuy(float value){
        int newPoints = ((int) (value * pointsPercentage)) / 100;
        int bonusPoints = 5 * (newPoints % 50);

        this.points += newPoints + bonusPoints;
    }


    public float getTotalValue(){
        return this.totalValue;
    }

    public String getCode(){
        return this.code;
    }

    public String getOwner(){
        return this.owner;
    }

    public int getPointsPercentage(){
        return this.pointsPercentage;
    }

    public int getPoints(){
        return this.points;
    }

    public String toString(){
        return this.owner + "'s card currently has '" + this.points + " points.";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (( o == null) || (this.getClass() != o.getClass()))
            return false;
        CartaoCliente v = (CartaoCliente) o;
        return (this.code == v.getCode());
    }

   public int hashCode() {
       return this.code.hashCode();
   }

    public CartaoCliente clone(){
        return new CartaoCliente(this);
    }

}

public class Ex04CartaoCliente {
    
    public static void main(String[] args) {
        // TODO: Testing on Main
        
    }
    
}
