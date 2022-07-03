package Personagem;

import Estados.*;
import Strategy.*;

public class PersonagemFraco extends Personagem{
    public PersonagemFraco()
    {
        this.setLife(100);
        this.setLifeState(new Forte(this));
        
        this.setAtaque(new AtaqueFraco());
        this.setCorrida(new CorridaDevagar());
        this.setPulo(new PuloBaixo());
    }
}
