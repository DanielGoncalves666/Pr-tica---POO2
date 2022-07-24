package Personagem;

import Estados.*;
import Strategy.*;
import Escudos.*;

public class PersonagemLadino extends Personagem{
    public PersonagemLadino()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        
        this.setAtaque( AtaqueFraco.getInstancia());
        this.setCorrida( CorridaRapida.getInstancia());
        this.setPulo( PuloAlto.getInstancia());
        
        this.adicionarEscudo(new Escudo2());
        this.adicionarEscudo(new Escudo1());
    }
}
