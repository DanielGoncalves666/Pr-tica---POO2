package Estados;

import Personagem.*;
import Strategy.*;

public class Perigo extends LifeState
{
    public Perigo(Personagem p)
    {
        super(p);   
        
        this.getPersonagem().setAtaque(new AtaqueFraco());
        this.getPersonagem().setCorrida(new CorridaDevagar());
        // ataque fraco e velocidade lenta
    }
    
    public void setLimites()
    {
        this.setLimiteInferior(1);
        this.setLimiteSuperior(29);
    }
    
    public void verificarAlteracaoEstado()
    {
        if(this.getPersonagem().getLife() < this.getLimiteInferior())
        {
            this.getPersonagem().setLifeState(new Morto(this.getPersonagem()));
        }
        else if(this.getPersonagem().getLife() > this.getLimiteSuperior())
        {
            this.getPersonagem().setLifeState(new Normal(this.getPersonagem()));
            this.getPersonagem().getLifeState().verificarAlteracaoEstado();
        }
    }
}