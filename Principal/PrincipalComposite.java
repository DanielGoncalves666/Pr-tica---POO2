package Principal;

import Fases.*;
import Personagem.*;
import Personagem.factory.*;

public class PrincipalComposite {
    
    public static void main(String args[])
    {
        /*
        FabricaMedieval fm = FabricaMedieval.getInstancia();
        Personagem p = fm.criarPersonagem();
        
        PhaseComponent saida = new Saida();
        PhaseComponent abismo = new Abismo();
        PhaseComponent sala1 = new Sala(saida,abismo, fm.criarInimigo());
        PhaseComponent sala2 = new Sala(saida, sala1, fm.criarInimigo());
        PhaseComponent sala3 = new Sala(sala1, sala2, fm.criarInimigo());
        
        sala3.jogar(p);
        */
    } 
}
