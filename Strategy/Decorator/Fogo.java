package Strategy.Decorator;

import Strategy.Ataque;

public class Fogo extends PoderAtaque
{
    public Fogo(Ataque ataqueDecorado)
    {
        super(ataqueDecorado);
    }
    
    // decorar o comportamento do objeto
    public double ataque()
    {
        double motificarAnterior = getAtaqueDecorado().ataque();
        System.out.print("---Com Fogo\n");

        return motificarAnterior + 0.3;
    }
}
