package Jogar;

import Fases.*;
import Personagem.Personagem;

// command concreto
public class JogarJogoConcreto implements JogarJogo {
    
    private PhaseComponent s;
    
    public JogarJogoConcreto(PhaseComponent s)
    {
        this.s = s;
    }
    
    public void execute(Personagem p)
    {
        s.jogar(p);
    }
}
