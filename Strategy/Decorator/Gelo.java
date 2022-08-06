package Strategy.Decorator;

import Strategy.Ataque;

public class Gelo extends PoderAtaque
{
    public Gelo(Ataque ataqueDecorado)
    {
        super(ataqueDecorado);
    }
    
    // decorar o comportamento do objeto
    public double ataque()
    {
        double motificarAnterior = getAtaqueDecorado().ataque();
        System.out.print("---Com gelo\n");

        return motificarAnterior + 0.1;
    }
}
