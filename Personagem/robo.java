package Personagem;

import Estados.Forte;
import Personagem.factory.FabricaFuturista;
import Strategy.AtaqueForte;

public class robo extends Personagem {
    
    public robo()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        this.setAtaque(AtaqueForte.getInstancia());
        
        FabricaFuturista ff = FabricaFuturista.getInstancia();
        this.setArma(ff.criarArma());
    }
}
