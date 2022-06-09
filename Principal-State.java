// Personagens01, 02 e 03 removidos à partir da inclusão do padrão State

public class Principal
{
    public static void main(String args[])
    {
        Personagem Mario = new Personagem();

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
        
        // morto
        Mario.sofrerDano(100.0);
        Mario.printLifeState();
        Mario.atacar();
        Mario.correr();
        System.out.print("\n");
       
    }
}

