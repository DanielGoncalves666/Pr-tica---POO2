package Estados;

import Personagem.*;
import Strategy.*;

public class Forte extends LifeState
{
    private static Forte instancia = null;
    
    private Forte()
    {
        super();
    }
    
    public static synchronized Forte getInstancia()
    {
        if(instancia == null)
            instancia = new Forte();
        
        return instancia;
    }
    
    public void setLimites()
    {
        this.setLimiteInferior(70);
        this.setLimiteSuperior(100);
    }
    
    public void verificarAlteracaoEstado(Personagem p)
    {
         if(p.getLife() < this.getLimiteInferior())
        {
            p.setLifeState(Normal.getInstancia());
            p.getLifeState().alterarEstrategias(p);
            p.getLifeState().verificarAlteracaoEstado(p);            
        }
    }
    
    protected void alterarEstrategias(Personagem p)
    {
        alterarAtaque(p, AtaqueForte.getInstancia());
        
        p.setCorrida( CorridaRapida.getInstancia());
        // ataque forte e velocidade rapida   
    }
}