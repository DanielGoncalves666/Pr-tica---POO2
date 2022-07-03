package Personagem;

public class FabricaPersonagemSimples extends FabricaPersonagem{
    
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
