package Personagem;

import Estados.*;
import Strategy.*;
import Escudos.*;

public class PersonagemTanque extends Personagem{
    public PersonagemTanque()
    {
        this.setLife(100);
        this.setLifeState(new Forte(this));
        
        this.setAtaque(new AtaqueMedio());
        this.setCorrida(new CorridaDevagar());
        this.setPulo(new PuloBaixo());
        
        this.adicionarEscudo(new Escudo5());
        this.adicionarEscudo(new Escudo5());
    }
}
