package Strategy.Decorator;

import Strategy.Ataque;

public class Trovao extends PoderAtaque
{
    public Trovao(Ataque ataqueDecorado)
    {
        super(ataqueDecorado);
    }
    
    // decorar o comportamento do objeto
    public double ataque()
    {
        double motificarAnterior = getAtaqueDecorado().ataque();
        System.out.print("---Com Trovao\n");

        return motificarAnterior + 0.15;
    }
}
