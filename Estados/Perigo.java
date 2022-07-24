package Estados;

import Personagem.*;
import Strategy.*;

public class Perigo extends LifeState
{
    private static Perigo instancia = null;
    
    private Perigo()
    {
        super();
    }
    
    public static synchronized Perigo getInstancia()
    {
        if(instancia == null)
            instancia = new Perigo();
        
        return instancia;
    }
    
    public void setLimites()
    {
        this.setLimiteInferior(1);
        this.setLimiteSuperior(29);
    }
    
    public void verificarAlteracaoEstado(Personagem p)
    {
        if(p.getLife() < this.getLimiteInferior())
        {
            p.setLifeState( Morto.getInstancia());
            p.getLifeState().alterarEstrategias(p);
        }
        else if(p.getLife() > this.getLimiteSuperior())
        {
            p.setLifeState( Normal.getInstancia());
            p.getLifeState().alterarEstrategias(p);
            p.getLifeState().verificarAlteracaoEstado(p);
        }
    }
    
    protected void alterarEstrategias(Personagem p)
    {
        p.setAtaque( AtaqueFraco.getInstancia());
        p.setCorrida( CorridaDevagar.getInstancia());
        // ataque fraco e velocidade lenta
    }
}