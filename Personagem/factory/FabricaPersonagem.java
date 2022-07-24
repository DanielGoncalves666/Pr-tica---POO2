package Personagem.factory;

import Personagem.Personagem;

public abstract class FabricaPersonagem {
    
    protected abstract Personagem createPersonagem();
    
    public Personagem criar()
    {
        return createPersonagem();
    }
    
    /*
        Se adicionarmos ataques o suficiente as estratégias básicas e objetos decorados serão perdidos
    */
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
