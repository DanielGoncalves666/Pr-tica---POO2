package Principal;


import Personagem.factory.*;
import Personagem.*;

public class PrincipalSingleton {

    public static void main(String args[])
    {
        FabricaPersonagem simples = FabricaPersonagemSimples.getInstancia();
        FabricaPersonagem complexa = FabricaPersonagemAvancada.getInstancia();
        
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
