package Personagem;

public class FabricaPersonagemAvancada extends FabricaPersonagem {
    
    public Personagem createPersonagem()
    {
        double rand = Math.random();
        Personagem criado;
        
        if(rand <= 0.2)
        {
            criado = new PersonagemTanque();
        }
        else if(rand <= 0.4)
        {
            criado = new PersonagemMago();
        }
        else if(rand <= 0.6)
        {
            criado = new PersonagemLadino();
        }
        else if(rand <= 0.8)
        {
            criado = new PersonagemPerfeito();
        }
        else
        {
            criado = new PersonagemFraco();
        }
        
        rand = Math.random();
        if(rand <= 0.33)
        {
            criado.adiconarPoderAtaque(1); // fogo
        }
        else if(rand <= 0.66)
        {
            criado.adiconarPoderAtaque(2); // gelo
        }
        else
        {
            criado.adiconarPoderAtaque(3); // trovao
        }
        
        return criado;
    }
}
