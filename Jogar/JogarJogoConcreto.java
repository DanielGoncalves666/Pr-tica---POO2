package Jogar;

import Fases.*;
import Personagem.Personagem;

// command concreto
public class JogarJogoConcreto implements JogarJogo {
    
    private Sala s;
    
    public JogarJogoConcreto(Sala s)
    {
        this.s = s;
    }
    
    public void execute(Personagem p)
    {
        s.jogar(p);
    }
}
