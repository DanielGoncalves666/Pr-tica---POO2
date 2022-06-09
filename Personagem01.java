import Ataques.*;
import Pulos.*;
import Corridas.*;

public class Personagem01 extends Personagem
{
    public Personagem01()
    {
        this.setPulo(new PuloMedio());
        this.setCorrida(new CorridaMedia());
        this.setAtaque(new AtaqueForte());
    }
}
