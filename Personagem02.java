import Ataques.*;
import Pulos.*;
import Corridas.*;

public class Personagem02 extends Personagem
{
    public Personagem02()
    {
        this.setPulo(new PuloAlto());
        this.setCorrida(new CorridaRapida());
        this.setAtaque(new AtaqueMedio());
    }
}
