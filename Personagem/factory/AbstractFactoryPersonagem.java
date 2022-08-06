package Personagem.factory;

import Armas.Arma;
import Escudos.*;
import Personagem.*;


public abstract class AbstractFactoryPersonagem {
    
    public abstract Personagem criarPersonagem();
    public abstract Personagem criarInimigo();
    public abstract Escudo criarDefesa(int op);
    public abstract Arma criarArma(int op);
    public abstract Arma criarPunho();
}
