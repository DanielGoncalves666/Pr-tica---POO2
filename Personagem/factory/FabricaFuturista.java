package Personagem.factory;

import Armas.*;
import Escudos.*;
import Personagem.*;

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
        return new robo();
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
    
    public Arma criarArma()
    {
        return new RaioParalisante();
    }
    
    public Arma criarPunho()
    {
        return new MaoMetalica();
    }
}
