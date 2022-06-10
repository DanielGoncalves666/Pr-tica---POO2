public abstract class LifeState
{
    private Personagem personagem;
    
    private int limiteInferior;
    private int limiteSuperior;
    
    public LifeState(Personagem p)
    {
        this.personagem = p;
        setLimites();
    }
    
    public void sofrerDano(int dano)
    {
        this.personagem.setLife(this.personagem.getLife() - dano);
        verificarAlteracaoEstado();
    }

    public void recuperarVida(int recuperar)
    {
        this.personagem.setLife(this.personagem.getLife() + recuperar);
        verificarAlteracaoEstado();
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
    
    public Personagem getPersonagem()
    {
        return personagem;
    }
    
    public abstract void setLimites();
    public abstract void verificarAlteracaoEstado();
}