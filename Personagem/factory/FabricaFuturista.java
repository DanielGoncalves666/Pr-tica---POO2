package Personagem.factory;

import Armas.*;
import Escudos.*;
import Personagem.*;
import Strategy.AtaqueForte;

public class FabricaFuturista extends AbstractFactoryPersonagem {
    
    private static FabricaFuturista instancia = null;
    
    private FabricaFuturista()
    {
        super();
    }   
    
    public static synchronized FabricaFuturista getInstancia()
    {
        if(instancia == null)
            instancia = new FabricaFuturista();
        
        return instancia;
    }
    
    public Personagem criarPersonagem()
    {
        Personagem robo = new Robo();
        
        robo.setArma(this.criarArma(0));
        robo.adicionarEscudo(this.criarDefesa(3));
        robo.adicionarEscudo(this.criarDefesa(3));
        
        return robo;
    }
    
    public Personagem criarInimigo()
    {
        Personagem inimigo = null;
        
        double rand = Math.random();
        
        if(rand <= 0.2)
        {
            inimigo = new Robo();
            inimigo.setArma(this.criarPunho());
            inimigo.adicionarEscudo(this.criarDefesa(2));
            inimigo.setLife(50);
            inimigo.setAtaque(AtaqueForte.getInstancia());
        }
        else if(rand <= 0.4)
        {
            inimigo = new Robo();
            inimigo.setArma(this.criarArma(0));
            inimigo.adicionarEscudo(this.criarDefesa(3));
            inimigo.setLife(40);
            inimigo.setAtaque(AtaqueForte.getInstancia());
        }
        else if(rand <= 0.6)
        {
            inimigo = new RoboCanhoneiro();
            inimigo.setArma(this.criarPunho());
            inimigo.setLife(50);
            inimigo.setAtaque(AtaqueForte.getInstancia());
        }
        else if(rand <= 0.8)
        {
            inimigo = new RoboCanhoneiro();
            inimigo.setArma(this.criarArma(1));
            inimigo.adicionarEscudo(this.criarDefesa(3));
            inimigo.adicionarEscudo(this.criarDefesa(3));
            inimigo.adicionarEscudo(this.criarDefesa(3));
            inimigo.setLife(40);
            inimigo.setAtaque(AtaqueForte.getInstancia());
        }
        else
        {
            inimigo = new RoboCanhoneiro();
            inimigo.setArma(this.criarArma(1));
            inimigo.setLife(50);
            inimigo.setAtaque(AtaqueForte.getInstancia());
        }
        
        return inimigo;
    }
    
    public Escudo criarDefesa(int op)
    {
        Escudo e = null;
        
        if(op < 1 || op > 5)
            e =  new CampoMagneticoFraco();
               
        switch(op)
        {
            case 1:
                e = new CampoMagneticoFraco();
                break;
            case 2:
                e = new CampoMagneticoMedio();
                break;
            case 3:
                e = new CampoMagneticoForte();
                break;
        }
        
        return e;
    }
    
    public Arma criarArma(int op)
    {
        if(op == 0)
            return new RaioParalisante();
        else
            return new CanhaoIons();
    
    }
    
    public Arma criarPunho()
    {
        return new MaoMetalica();
    }
}
