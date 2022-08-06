package Estados;

import Personagem.*;

public class Morto extends LifeState
{
    private static Morto instancia = null;
    
    private Morto()
    {
        super();
    }
    
    public static synchronized Morto getInstancia()
    {
        if(instancia == null)
            instancia = new Morto();
        
        return instancia;
    }
    
    public void setLimites()
    {
        this.setLimiteInferior(0);
        this.setLimiteSuperior(0);
    }
    
    public void verificarAlteracaoEstado(Personagem p)
    {
        //p.setLifeState(Morto.getInstancia()); // continua morto
        //p.getLifeState().alterarEstrategias(p);
        System.out.print("Morto - Fim de jogo.\n");
    }
    
    public boolean getStatus()
    {
        return false;// estado que indica morto
    }
    
    protected void alterarEstrategias(Personagem p){}
}