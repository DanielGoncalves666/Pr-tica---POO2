import Strategy.*;

public class Normal extends LifeState
{
    public Normal(Personagem p)
    {
        super(p);
        this.getPersonagem().setAtaque(new AtaqueMedio());
        this.getPersonagem().setCorrida(new CorridaMedia());
        // ataque medio e velocidade media
    }
    
    public void setLimites()
    {
        this.setLimiteInferior(30.0);
        this.setLimiteSuperior(70.0);
    }
    
    public void verificarAlteracaoEstado()
    {
        if(this.getPersonagem().getLife() < this.getLimiteInferior())
        {
            this.getPersonagem().setLifeState(new Perigo(this.getPersonagem()));
            this.getPersonagem().getLifeState().verificarAlteracaoEstado();
        }
        else if(this.getPersonagem().getLife() > this.getLimiteSuperior())
        {            
            this.getPersonagem().setLifeState(new Forte(this.getPersonagem()));
        }
    }
}