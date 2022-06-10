package Escudos;


/**
 handler
 */
public abstract class Escudo
{
    private Escudo prox; // proximo item na cadeia de responsabilidade
    
    public void setProx(Escudo prox)
    {
        this.prox = prox;
    }
    
    public Escudo getProx()
    {
        return this.prox;
    }
    
    public abstract int processaDefesa(int ataque);
}
