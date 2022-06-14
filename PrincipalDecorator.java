import Escudos.*;

public class PrincipalDecorator
{
    public static void main(String args[])
    {
        Personagem Mario = new Personagem();
        
        Mario.adicionarEscudo(new Escudo1());
        Mario.adicionarEscudo(new Escudo5());
        
        Mario.adiconarPoderAtaque(1);// quando o jogador muda de estado o poder é perdido
        
        // normal
        System.out.print("Valor ataque: " + Mario.atacar() + "\n");
        Mario.correr();
        Mario.pular();
        System.out.print("\n");
 
        // forte
        Mario.recuperarVida(25);
        Mario.printLifeState();
        System.out.print("Valor ataque: " + Mario.atacar() + "\n");
        Mario.correr();
        System.out.print("\n");
        
        Mario.adiconarPoderAtaque(1);
        Mario.adiconarPoderAtaque(2);
        Mario.adiconarPoderAtaque(3);
        
        // normal
        Mario.sofrerDano(25);
        Mario.printLifeState();
        System.out.print("Valor ataque: " + Mario.atacar() + "\n");
        Mario.correr();
        System.out.print("\n");
        
        // Perigo
        Mario.sofrerDano(45);
        Mario.printLifeState();
        System.out.print("Valor ataque: " + Mario.atacar() + "\n");
        Mario.correr();
        System.out.print("\n");
        
        // forte
        Mario.recuperarVida(90);
        Mario.printLifeState();
        System.out.print("Valor ataque: " + Mario.atacar() + "\n");
        Mario.correr();
        System.out.print("\n");
        
        // perigo
        Mario.sofrerDano(100);
        Mario.printLifeState();
        System.out.print("Valor ataque: " + Mario.atacar() + "\n");
        Mario.correr();
        System.out.print("\n");
    }
}
