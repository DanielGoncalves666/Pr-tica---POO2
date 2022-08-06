package Personagem.factory;

import Armas.Arma;
import Escudos.*;
import Personagem.*;


public abstract class AbstractFactoryPersonagem {
    
    public abstract Personagem criarPersonagem();
    public abstract Escudo criarDefesa(int op);
    public abstract Arma criarArma();
    public abstract Arma criarPunho();
}
