import Escudos.*;

public class PrincipalChain 
{
    public static void main(String args[])
    {
        Personagem Mario = new Personagem();
        
        Mario.adicionarEscudo(new Escudo1());
        Mario.adicionarEscudo(new Escudo5());
        
        // normal
        Mario.atacar();
        Mario.correr();
        Mario.pular();
        System.out.print("\n");
 
        // forte
        Mario.recuperarVida(25);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        // normal
        Mario.sofrerDano(25);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        // Perigo
        Mario.sofrerDano(45);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        // forte
        Mario.recuperarVida(90);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        // perigo
        Mario.sofrerDano(100);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
    }
}
