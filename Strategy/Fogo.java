package Strategy;

public class Fogo extends PoderAtaque
{
    public Fogo(Ataque ataqueDecorado)
    {
        super(ataqueDecorado);
    }
    
    // decorar o comportamento do objeto
    public int ataque()
    {
        int ataqueAnterior = getAtaqueDecorado().ataque();
        System.out.print("---Com Fogo\n");

        return ataqueAnterior + 10;
    }
}
