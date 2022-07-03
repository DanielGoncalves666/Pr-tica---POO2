package Personagem;

import Estados.*;
import Strategy.*;
import Escudos.*;

public class PersonagemLadino extends Personagem{
    public PersonagemLadino()
    {
        this.setLife(100);
        this.setLifeState(new Forte(this));
        
        this.setAtaque(new AtaqueFraco());
        this.setCorrida(new CorridaRapida());
        this.setPulo(new PuloAlto());
        
        this.adicionarEscudo(new Escudo2());
        this.adicionarEscudo(new Escudo1());
    }
}
