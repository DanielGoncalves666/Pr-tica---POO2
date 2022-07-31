package Strategy.Decorator;

import Strategy.Ataque;

public abstract class PoderAtaque extends Ataque
{
    private Ataque ataqueDecorado; // referencia ao objeto a ser decorado
    
    public PoderAtaque(Ataque ataqueDecorado)
    {
        setProx(ataqueDecorado);
    }
    
    public Ataque getAtaqueDecorado()
    {
        return this.ataqueDecorado;
    }
    
    // decorar o comportamento dos objetos
    public abstract int ataque();
    
    public boolean isFinal()
    {
        return false;
    }
    
    // retorna o Ataque ao qual esta instancia decora
    public Ataque getProx()
    {
        return ataqueDecorado;
    }
    
    // seta o ataque que esta instancia decora
    public void setProx(Ataque ad)
    {
        ataqueDecorado = ad;
    }
}
