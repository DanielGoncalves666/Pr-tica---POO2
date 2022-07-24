package Personagem;

import Estados.*;
import Strategy.*;

public class PersonagemFraco extends Personagem{
    public PersonagemFraco()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        
        this.setAtaque( AtaqueFraco.getInstancia());
        this.setCorrida( CorridaDevagar.getInstancia());
        this.setPulo( PuloBaixo.getInstancia());
    }
}
