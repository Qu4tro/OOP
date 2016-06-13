class Produto {
    /*
    Um Produto de um dado stock de produtos possui as seguintes características de informacão: cóodigo, nome, quantidade em stock, quantidade mínima, preço de compra e preço de venda a público. Desenvolva uma classe Produto e os seguintes métodos de instância:
        * Alterar a quantidade de um produto, ou por saída ou por entrada de uma dada quantidade do produto no stock;
        * Modificar o nome do produto;
        * Modificar o preco de venda de um dado produto;    
        * Determinar o valor total da quantidade em stock em caso de venda;
        * Determinar o lucro actual de tal stock em caso de venda total;
        * Dada uma encomenda de X unidades do produto, determinar o preçco total de tal encomenda;
        * Verificar se um produto está ja abaixo do nıvel mínimo de stock.
    */

    private String code;
    private String name;
    private int stock;
    private int stockMinimo;
    private float buyingPrice;
    private float sellingPrice;

    Produto() {
        this.code = "";
        this.name = "";
        this.stock = 0;
        this.stockMinimo = 0;
        this.buyingPrice = 0;
        this.sellingPrice = 0;
    }

    Produto(String code, String name, int stockMinimo, float buyingPrice) {
        this.code = code;
        this.name = name;
        this.stock = 0;
        this.stockMinimo = stockMinimo;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = 0;
    }

    Produto(Produto p) {
        this.code = p.getCode();
        this.name = p.getName();
        this.stock = p.getStock();
        this.stockMinimo = p.getStockMinimo();
        this.buyingPrice = p.getBuyingPrice();
        this.sellingPrice = p.getSellingPrice();
    }


    public float totalGrossEarnings(){
        return this.sellingPrice * this.stock; 
    }

    public float totalProfit(){
        return totalGrossEarnings() - (this.stock * this.buyingPrice);
    }

    public float orderPrice(int quantity){
        return quantity * this.buyingPrice; 
    }

    public boolean isBelowStock(){
        return this.stock < this.stockMinimo; 
    }

    public String getCode(){
        return this.code; 
    }
    public String getName(){
        return this.name; 
    }
    public int getStock(){
        return this.stock; 
    }
    public int getStockMinimo(){
        return this.stockMinimo; 
    }
    public float getBuyingPrice(){
        return this.buyingPrice; 
    }
    public float getSellingPrice(){
        return this.sellingPrice; 
    }
    public void addStock(int newStock){
        this.stock += newStock;
    }
    public void removeStock(int boughtStock){
        this.stock -= boughtStock;
    }
    public void setName(String newName){
        this.name = newName; 
    }
    public void setBuyingPrice(float newBuyingPrice){
        this.buyingPrice = newBuyingPrice; 
    }
    public void setSellingPrice(float newSellingPrice){
        this.sellingPrice = newSellingPrice; 
    }

    public String toString(){
        return this.name + ": " + this.stock;
    }

    public Produto clone(){
        return new Produto(this);
    }

    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())){
            return false;	
        }
        Produto p = (Produto) o;
        
        return code == p.getCode();
    }

    public int hashCode(){
        int hash = 7;
        hash = hash * 31 + this.code.hashCode();
        return hash;
    }
    
    
}


public class Ex06Produto {
    
    public static void main(String[] args) {

        // TODO: Testing
        
    }
    
}
