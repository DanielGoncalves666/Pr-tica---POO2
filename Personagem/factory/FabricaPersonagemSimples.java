package Personagem.factory;

import Personagem.*;

public class FabricaPersonagemSimples extends FabricaPersonagem{
    
    private static FabricaPersonagemSimples instancia = null;
    
    // impede a criação com o construtor    
    private FabricaPersonagemSimples(){};

    // lazy instantiation 
    public static synchronized FabricaPersonagemSimples getInstancia()
    {
        if(instancia == null)
            instancia = new FabricaPersonagemSimples();
        
        return instancia;
    }
    
    public Personagem createPersonagem()
    {
        double rand = Math.random();
        
        if(rand <= 0.2)
        {
            return new PersonagemTanque();
        }
        else if(rand <= 0.4)
        {
            return new PersonagemMago();
        }
        else if(rand <= 0.6)
        {
            return new PersonagemLadino();
        }
        else if(rand <= 0.8)
        {
            return new PersonagemPerfeito();
        }
        else
        {
            return new PersonagemFraco();
        }
    }
}
