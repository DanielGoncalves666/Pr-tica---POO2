package Principal;


import Personagem.*;


public class PrincipalStateCorrigido {

    public static void main(String args[])
    {
        Personagem Mario = new PersonagemPerfeito();
        Personagem Luigi = new PersonagemPerfeito();
                
        // forte
        Mario.atacar(Luigi);
        Mario.correr();
        Mario.pular();
        System.out.print("\n");
 
        // forte
        Mario.recuperarVida(25);
        Mario.printLifeState();
        Mario.atacar(Luigi);
        Mario.correr();
        System.out.print("\n");
        
        Mario.adiconarPoderAtaque(1);
        Mario.adiconarPoderAtaque(2);
        Mario.adiconarPoderAtaque(3);
        
        // normal
        Mario.sofrerDano(50);
        Mario.printLifeState();
        Mario.atacar(Luigi);
        Mario.correr();
        System.out.print("\n");
        
        // Perigo
        Mario.sofrerDano(45);
        Mario.printLifeState();
        Mario.atacar(Luigi);
        Mario.correr();
        System.out.print("\n");
        
        // forte
        Mario.recuperarVida(90);
        Mario.printLifeState();
        Mario.atacar(Luigi);
        Mario.correr();
        System.out.print("\n");
        
        // perigo
        Mario.sofrerDano(100);
        Mario.printLifeState();
        Mario.atacar(Luigi);
        Mario.correr();
        System.out.print("\n");
        
        Mario.recuperarVida(100);
        Mario.printLifeState();
        Mario.atacar(Luigi);
        Mario.correr();
        System.out.print("\n");
    }
    
}
