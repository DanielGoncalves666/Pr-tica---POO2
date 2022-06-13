package Strategy;

public class Trovao extends PoderAtaque
{
    public Trovao(Ataque ataqueDecorado)
    {
        super(ataqueDecorado);
    }
    
    // decorar o comportamento do objeto
    public int ataque()
    {
        int ataqueAnterior = getAtaqueDecorado().ataque();
        System.out.print("---Com Trovao\n");

        return ataqueAnterior + 7;
    }
}
