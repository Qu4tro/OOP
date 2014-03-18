public class Telemovel
{

    private String modelo;
    private double preco;
    private int mem; //em GB

    public Telemovel()
    {
        this.modelo = "";
        this.preco  = 0.0;
        this.mem    = 0;
    }

    public Telemovel(Telemovel t)
    {
        this.modelo = t.getModelo();
        this.preco  = t.getPreco();
        this.mem    = t.getMem();
    }

    public void aumentaPreco(int x)
    { this.setPreco(this.getPreco()*(1 + (double) x/100)); }

    public String toString()
    {
        return new String("Telemovel: " + this.modelo + " " + this.preco + " " + this.mem);
    }

    public String getModelo()
    	{ return this.modelo; }

    public void setModelo(String modelo)
    	{ this.modelo = modelo; }

    public double getPreco()
    	{ return this.preco; }

    public void setPreco(double preco)
    	{ this.preco = preco; }

    public int getMem()
    	{ return this.mem; }

    public void setMem(int mem)
    	{ this.mem = mem; }
}
