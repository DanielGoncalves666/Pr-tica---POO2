package Personagem;

import Estados.*;
import Strategy.*;
import Escudos.*;

public class PersonagemMago extends Personagem{
    public PersonagemMago()
    {
        this.setLife(100);
        this.setLifeState(new Forte(this));
        
        this.setAtaque(new AtaqueForte());
        this.setCorrida(new CorridaMedia());
        this.setPulo(new PuloMedio());
        
        this.adicionarEscudo(new Escudo2());
    }
}
