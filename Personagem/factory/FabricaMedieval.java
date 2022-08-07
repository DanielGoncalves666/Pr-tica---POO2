package Personagem.factory;

import Armas.*;
import Escudos.*;
import Personagem.*;
import Strategy.AtaqueForte;

public class FabricaMedieval extends AbstractFactoryPersonagem {
    
    private static FabricaMedieval instancia = null;
    
    private FabricaMedieval()
    {
        super();
    }   
    
    public static synchronized FabricaMedieval getInstancia()
    {
        if(instancia == null)
            instancia = new FabricaMedieval();
        
        return instancia;
    }
    
    public Personagem criarPersonagem()
    {
        Personagem arqueiro = new Arqueiro();
        
        arqueiro.setArma(this.criarArma(0));
        arqueiro.adicionarEscudo(this.criarDefesa(3));
        arqueiro.adicionarEscudo(this.criarDefesa(3));
        
        return arqueiro;
    }
    
    public Personagem criarInimigo()
    {
        Personagem inimigo = null;
        
        double rand = Math.random();
        
        if(rand <= 0.2)
        {
            inimigo = new Arqueiro();
            inimigo.setArma(this.criarPunho());
            inimigo.adicionarEscudo(this.criarDefesa(2));
            inimigo.setLife(50);
            inimigo.setAtaque(AtaqueForte.getInstancia());
            inimigo.adicionarPoderAtaque(3);
        }
        else if(rand <= 0.4)
        {
            inimigo = new Arqueiro();
            inimigo.setArma(this.criarArma(0));
            inimigo.adicionarEscudo(this.criarDefesa(3));
            inimigo.setLife(40);
            inimigo.setAtaque(AtaqueForte.getInstancia());
            inimigo.adicionarPoderAtaque(3);
        }
        else if(rand <= 0.6)
        {
            inimigo = new Lanceiro();
            inimigo.setArma(this.criarPunho());
            inimigo.setLife(50);
            inimigo.setAtaque(AtaqueForte.getInstancia());
            inimigo.adicionarPoderAtaque(3);
        }
        else if(rand <= 0.8)
        {
            inimigo = new Lanceiro();
            inimigo.setArma(this.criarArma(1));
            inimigo.adicionarEscudo(this.criarDefesa(3));
            inimigo.adicionarEscudo(this.criarDefesa(3));
            inimigo.adicionarEscudo(this.criarDefesa(3));
            inimigo.adicionarEscudo(this.criarDefesa(3));            
            inimigo.setLife(50);
            inimigo.setAtaque(AtaqueForte.getInstancia());
            inimigo.adicionarPoderAtaque(3);
        }
        else
        {
            inimigo = new Lanceiro();
            inimigo.setArma(this.criarArma(1));
            inimigo.setLife(50);
            inimigo.setAtaque(AtaqueForte.getInstancia());
            inimigo.adicionarPoderAtaque(3);
        }
        
        return inimigo;
    }
    
    public Escudo criarDefesa(int op)
    {
        Escudo e = null;
        
        if(op < 1 || op > 5)
            e =  new EscudoMadeira();
               
        switch(op)
        {
            case 1:
                e = new EscudoMadeira();
                break;
            case 2:
                e = new EscudoFerro();
                break;
            case 3:
                e = new EscudoDiamante();
                break;
        }
        
        return e;
    }
    
    public Arma criarArma(int op)
    {
        if(op == 0)
            return new ArcoFlecha();
        else
            return new Lanca();
    }
    
    public Arma criarPunho()
    {
        return new Punho();
    }
}
