package Strategy.Decorator;

import Strategy.Ataque;

public class Gelo extends PoderAtaque
{
    public Gelo(Ataque ataqueDecorado)
    {
        super(ataqueDecorado);
    }
    
    // decorar o comportamento do objeto
    public int ataque()
    {
        int ataqueAnterior = getAtaqueDecorado().ataque();
        System.out.print("---Com gelo\n");

        return ataqueAnterior + 5;
    }
}
