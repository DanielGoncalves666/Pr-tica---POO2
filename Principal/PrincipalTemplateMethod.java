package Principal;

import Personagem.Personagem;
import Fases.*;
import Personagem.factory.*;


public class PrincipalTemplateMethod {

    public static void main(String args[])
    {
        
        FabricaFuturista ff = FabricaFuturista.getInstancia();
        Personagem p = ff.criarPersonagem();
        
        PhaseComponent saida = new Saida();
        PhaseComponent abismo = new Abismo();
        PhaseComponent sala1 = new SalaRandomizada(saida,abismo, ff.criarInimigo());
        PhaseComponent sala2 = new SalaRandomizada(saida, sala1, ff.criarInimigo());
        PhaseComponent sala3 = new SalaRandomizada(sala1, sala2, ff.criarInimigo());
        
        sala3.jogar(p);
        
        System.out.println("---------------------------------------------");
        
        FabricaMedieval fm = FabricaMedieval.getInstancia();
        Personagem pp = fm.criarPersonagem();
        
        PhaseComponent saida1 = new Saida();
        PhaseComponent abismo1 = new Abismo();
        PhaseComponent sala11 = new SalaEscolha(saida1, abismo1, fm.criarInimigo());
        PhaseComponent sala22 = new SalaEscolha(saida1, sala11, fm.criarInimigo());
        PhaseComponent sala33 = new SalaEscolha(sala11, sala22, fm.criarInimigo());
        
        sala33.jogar(pp);
        
    }
}
