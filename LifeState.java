public abstract class LifeState
{
    private Personagem personagem;
    
    private double limiteInferior;
    private double limiteSuperior;
    
    public LifeState(Personagem p)
    {
        this.personagem = p;
        setLimites();
    }
    
    public void sofrerDano(double dano)
    {
        this.personagem.setLife(this.personagem.getLife() - dano);
        verificarAlteracaoEstado();
    }

    public void recuperarVida(double recuperar)
    {
        this.personagem.setLife(this.personagem.getLife() + recuperar);
        verificarAlteracaoEstado();
    }
    
    public void setLimiteInferior(double inferior)
    {
        this.limiteInferior = inferior;
    }
    
    public void setLimiteSuperior(double superior)
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