import Fases.*;
import Jogar.*;
import Personagem.Personagem;
import Personagem.factory.*;

public class PrincipalThreads {

    public static void main(String args[])
    {
        FabricaFuturista ff = FabricaFuturista.getInstancia();
        Personagem p1 = ff.criarPersonagem();
        Personagem p2 = ff.criarPersonagem();
        Personagem p3 = ff.criarPersonagem();
        
        PhaseComponent saida = new Saida();
        PhaseComponent abismo = new Abismo();
        PhaseComponent sala1 = new SalaRandomizada(saida,abismo, ff.criarInimigo());
        PhaseComponent sala2 = new SalaRandomizada(saida, sala1, ff.criarInimigo());
        PhaseComponent sala3 = new SalaRandomizada(sala1, sala2, ff.criarInimigo());
        PhaseComponent sala4 = new SalaRandomizada(sala3, abismo, ff.criarInimigo());
        PhaseComponent sala5 = new SalaRandomizada(sala3, sala4, ff.criarInimigo());
        
        JogarJogo labirinto = new JogarJogoConcreto(sala5);
        
        
        p1.jogar(labirinto);
        p2.jogar(labirinto);
        p3.jogar(labirinto);
        
        Thread tp1 = new Thread(p1);
        Thread tp2 = new Thread(p2);
        Thread tp3 = new Thread(p3);
        
        tp1.setPriority(1);
        tp2.setPriority(1);
        tp3.setPriority(1);
        
        tp1.setName("Personagem 1");
        tp2.setName("Personagem 2");
        tp3.setName("Personagem 3");
        
        tp1.start();
        tp2.start();
        tp3.start();
        
    }
}
