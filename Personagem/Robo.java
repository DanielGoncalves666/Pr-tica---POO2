package Personagem;

import Estados.Forte;
import Strategy.*;

public class Robo extends Personagem {
    
    public Robo()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        this.setAtaque(AtaqueForte.getInstancia());
        this.setCorrida(CorridaRapida.getInstancia());
        this.setPulo(PuloAlto.getInstancia());
    }
}
