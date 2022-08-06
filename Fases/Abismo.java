package Fases;

import Personagem.Personagem;

public class Abismo implements PhaseComponent{
    
    public void jogar(Personagem p)
    {
        String id = p.toString().substring(0, p.toString().indexOf('@'));
        
        System.out.println("O " + id + " caiu no abismo.");
    }
}
