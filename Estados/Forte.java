package Estados;

import Personagem.*;
import Strategy.*;

public class Forte extends LifeState
{
    public Forte(Personagem p)
    {
        super(p);  
        this.getPersonagem().setAtaque(new AtaqueForte());
        this.getPersonagem().setCorrida(new CorridaRapida());
        // ataque forte e velocidade rapida
    }
    
    public void setLimites()
    {
        this.setLimiteInferior(70);
        this.setLimiteSuperior(100);
    }
    
    public void verificarAlteracaoEstado()
    {
         if(this.getPersonagem().getLife() < this.getLimiteInferior())
        {
            this.getPersonagem().setLifeState(new Normal(this.getPersonagem()));
            this.getPersonagem().getLifeState().verificarAlteracaoEstado();            
        }
    }
}