package Personagem;

import Estados.*;
import Strategy.*;
import Escudos.*;

public class PersonagemMago extends Personagem{
    public PersonagemMago()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        
        this.setAtaque( AtaqueForte.getInstancia());
        this.setCorrida( CorridaMedia.getInstancia());
        this.setPulo( PuloMedio.getInstancia());
        
        this.adicionarEscudo(new Escudo2());
    }
}
