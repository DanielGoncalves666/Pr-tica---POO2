package Estados;

import Personagem.*;

public abstract class LifeState
{    
    /*
        Para eliminar o atributo de instancia Personagem, foi necessário exigir que o personagem sofrendo
        dano ou recuperando vida fosse também passado.
        Deste modo, é possível alterar o valor da vida e alterar o estado diretamente no objeto da classe Personagem.
    */
    
    private int limiteInferior;
    private int limiteSuperior;
    
    public LifeState()
    {
        setLimites();
    }
    
    public void sofrerDano(Personagem p, int dano)
    {
        p.setLife(p.getLife() - dano);
        verificarAlteracaoEstado(p);
    }

    public void recuperarVida(Personagem p, int recuperar)
    {
        p.setLife(p.getLife() + recuperar);
        verificarAlteracaoEstado(p);
    }
    
    public void setLimiteInferior(int inferior)
    {
        this.limiteInferior = inferior;
    }
    
    public void setLimiteSuperior(int superior)
    {
        this.limiteSuperior = superior;
    }
    
    public double getLimiteInferior()
    {
        return this.limiteInferior;
    }
    
    public double getLimiteSuperior()
    {
        return this.limiteSuperior;
    }
    
    public abstract void setLimites();
    public abstract void verificarAlteracaoEstado(Personagem p);
    protected abstract void alterarEstrategias(Personagem p);
}