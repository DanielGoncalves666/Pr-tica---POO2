package Personagem;

public abstract class FabricaPersonagem {
    
    protected abstract Personagem createPersonagem();
    
    public Personagem criar()
    {
        return createPersonagem();
    }
    
    public void jogar()
    {
        Personagem p01 = createPersonagem();
        Personagem p02 = createPersonagem();
        
        p01.correr();
        p01.pular();
        p01.atacar(p02);
        p02.atacar(p01);
    }
}
