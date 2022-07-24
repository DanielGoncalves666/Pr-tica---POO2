package Personagem;

import Estados.*;
import Strategy.*;
import Escudos.*;

public class PersonagemPerfeito extends Personagem{
    public PersonagemPerfeito()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        
        this.setAtaque( AtaqueForte.getInstancia());
        this.setCorrida( CorridaRapida.getInstancia());
        this.setPulo( PuloAlto.getInstancia());
        
        this.adicionarEscudo(new Escudo5());
        this.adicionarEscudo(new Escudo5());
    }
}
