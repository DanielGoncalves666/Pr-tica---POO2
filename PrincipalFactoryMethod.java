
import Personagem.*;

public class PrincipalFactoryMethod {

    public static void main(String args[])
    {
        FabricaPersonagem simples = new FabricaPersonagemSimples();
        FabricaPersonagem complexa = new FabricaPersonagemAvancada();
        
        Personagem um = simples.criar();
        Personagem dois = complexa.criar();
        
        System.out.println(um.getClass().toString());
        um.printLifeState();

        System.out.println(dois.getClass().toString());
        dois.printLifeState();

        System.out.println();
        simples.jogar();
        System.out.println();
        complexa.jogar();
    }
}
