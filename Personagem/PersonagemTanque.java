package Personagem;

import Estados.*;
import Strategy.*;
import Escudos.*;

public class PersonagemTanque extends Personagem{
    public PersonagemTanque()
    {
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        
        this.setAtaque( AtaqueMedio.getInstancia());
        this.setCorrida( CorridaDevagar.getInstancia());
        this.setPulo( PuloBaixo.getInstancia());
        
        this.adicionarEscudo(new EscudoDiamante());
        this.adicionarEscudo(new EscudoDiamante());
    }
}
