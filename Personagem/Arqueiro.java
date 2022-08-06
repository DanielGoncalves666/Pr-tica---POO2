package Personagem;

import Estados.Forte;
import Personagem.factory.FabricaMedieval;
import Strategy.AtaqueForte;

public class Arqueiro extends Personagem {
    
    public Arqueiro()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        this.setAtaque(AtaqueForte.getInstancia());
        
        FabricaMedieval fb = FabricaMedieval.getInstancia();
        this.setArma(fb.criarArma());
    }
}
