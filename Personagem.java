import Ataques.*;
import Pulos.*;
import Corridas.*;

/**
 * Classe abstrata Personagem
 */

public abstract class Personagem
{
    private Ataque atk;
    private Correr run;
    private Pulo jump;
    
    public void atacar()
    {
        this.atk.ataque();    
    }
    
    public void correr()
    {
        this.run.correr();
    }
    
    public void pular()
    {
        this.jump.pular();
    }
    
    public void setAtaque(Ataque novo)
    {
        this.atk = novo;
    }
    
    public void setCorrida(Correr nova)
    {
        this.run = nova;
    }
    
    public void setPulo(Pulo novo)
    {
        this.jump = novo;
    }
}
