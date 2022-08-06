package Personagem;

import Estados.Forte;
import Strategy.*;

public class RoboCanhoneiro extends Personagem{
    
    public RoboCanhoneiro()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        this.setAtaque(AtaqueForte.getInstancia());
        this.setCorrida(CorridaMedia.getInstancia());
        this.setPulo(PuloMedio.getInstancia());
    }
}
