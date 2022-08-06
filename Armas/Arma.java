package Armas;

public abstract class Arma {
    protected int dano;
    protected String tipo;
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public int getDano()
    {
        return this.dano;
    }
}
