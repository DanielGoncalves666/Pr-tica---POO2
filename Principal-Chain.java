import Escudos.*;

public class Principal-Chain 
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
        Mario.recuperarVida(25.0);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        // normal
        Mario.sofrerDano(25.0);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        // Perigo
        Mario.sofrerDano(45.0);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        // forte
        Mario.recuperarVida(90.0);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
        
        // perigo
        Mario.sofrerDano(100.0);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
    }
}
