class CartaoCliente {

    private float totalValue;
    private String code;
    private String owner;
    public int pointsPercentage;
    private int points;

    CartaoCliente(String code, String owner){
        this.totalValue = 0;
        this.code = code;
        this.owner = owner;
        this.pointsPercentage = 10;
        this.points = 0;
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

    public boolean equals;

    public CartaoCliente clone(){
        return new CartaoCliente(this.code, this.owner);
    }

}

public class Ex04CartaoCliente {
    
    public static void main(String[] args) {
        // TODO: Equals and Testing on Main
        
    }
    
}
