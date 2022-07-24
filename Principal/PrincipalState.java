package Principal;

import Personagem.*;

// Personagens01, 02 e 03 removidos à partir da inclusão do padrão State

public class PrincipalState
{
    public static void main(String args[])
    {        
        Personagem Mario = new PersonagemTanque();
        
        // forte
        //Mario.atacar();
        Mario.printLifeState();        
        Mario.correr();
        Mario.pular();
        System.out.print("\n");
 
        Mario.recuperarVida(25);
        Mario.printLifeState();
        //Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        Mario.sofrerDano(25);
        Mario.printLifeState();
        //Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        Mario.sofrerDano(45);
        Mario.printLifeState();
        //Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        Mario.recuperarVida(90);
        Mario.printLifeState();
        //Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        Mario.sofrerDano(100);
        Mario.printLifeState();
        //Mario.atacar();
        Mario.correr();
        System.out.print("\n");
       
    }
}
