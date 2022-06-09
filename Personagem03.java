import Ataques.*;
import Pulos.*;
import Corridas.*;

public class Personagem03 extends Personagem
{
    public Personagem03()
    {
        this.setPulo(new PuloBaixo());
        this.setCorrida(new CorridaRapida());
        this.setAtaque(new AtaqueForte());
    }
}
