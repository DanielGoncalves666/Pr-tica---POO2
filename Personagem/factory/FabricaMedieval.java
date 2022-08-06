package Personagem.factory;

import Armas.*;
import Escudos.*;
import Personagem.*;

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
        return new Arqueiro();
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
    
    public Arma criarArma()
    {
        return new ArcoFlecha();
    }
    
    public Arma criarPunho()
    {
        return new Punho();
    }
}
