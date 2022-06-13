package Strategy;

public abstract class PoderAtaque implements Ataque
{
    private Ataque ataqueDecorado; // referencia ao objeto a ser decorado
    
    public PoderAtaque(Ataque ataqueDecorado)
    {
        this.ataqueDecorado = ataqueDecorado;
    }
    
    public Ataque getAtaqueDecorado()
    {
        return this.ataqueDecorado;
    }
    
    // decorar o comportamento dos objetos
    public abstract int ataque();
}
