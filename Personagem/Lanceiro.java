package Personagem;

import Estados.Forte;
import Strategy.*;

public class Lanceiro extends Personagem {
  
    public Lanceiro()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        this.setAtaque(AtaqueMedio.getInstancia());
        this.setCorrida(CorridaMedia.getInstancia());
        this.setPulo(PuloMedio.getInstancia());
    }
}
