package Estados;

import Personagem.*;
import Strategy.*;

public class Normal extends LifeState
{
    private static Normal instancia = null;
    
    private Normal()
    {
        super();
    }
    
    public static synchronized Normal getInstancia()
    {
        if(instancia == null)
            instancia = new Normal();
        
        return instancia;
    }
    
    public void setLimites()
    {
        this.setLimiteInferior(30);
        this.setLimiteSuperior(70);
    }
    
    public void verificarAlteracaoEstado(Personagem p)
    {
        if(p.getLife() < this.getLimiteInferior())
        {
            p.setLifeState(Perigo.getInstancia());
            p.getLifeState().alterarEstrategias(p);
            p.getLifeState().verificarAlteracaoEstado(p);
        }
        else if(p.getLife() > this.getLimiteSuperior())
        {            
            p.setLifeState( Forte.getInstancia());
            p.getLifeState().alterarEstrategias(p);
        }
    }
    
    protected void alterarEstrategias(Personagem p)
    {
        alterarAtaque(p, AtaqueMedio.getInstancia());

        p.setCorrida( CorridaMedia.getInstancia());
        // ataque medio e velocidade media   
    }

}