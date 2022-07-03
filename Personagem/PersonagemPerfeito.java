package Personagem;

import Estados.*;
import Strategy.*;
import Escudos.*;

public class PersonagemPerfeito extends Personagem{
    public PersonagemPerfeito()
    {
        this.setLife(100);
        this.setLifeState(new Forte(this));
        
        this.setAtaque(new AtaqueForte());
        this.setCorrida(new CorridaRapida());
        this.setPulo(new PuloAlto());
        
        this.adicionarEscudo(new Escudo5());
        this.adicionarEscudo(new Escudo5());
    }
}
