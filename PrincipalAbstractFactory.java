
import Armas.*;
import Personagem.Personagem;
import Personagem.factory.*;

public class PrincipalAbstractFactory 
{    
    public static void main(String args[])
    {
        AbstractFactoryPersonagem medieval = FabricaMedieval.getInstancia();
        AbstractFactoryPersonagem futurista = FabricaFuturista.getInstancia();
        
        Arma a = medieval.criarArma();
        System.out.println("Arma1: " + a.getTipo());
        
        a = medieval.criarPunho();
        System.out.println("Punho1: " + a.getTipo());
        
        a = futurista.criarArma();
        System.out.println("Arma2: " + a.getTipo());
        
        a = futurista.criarPunho();
        System.out.println("Punho2: " + a.getTipo());
        
        Personagem p1 = medieval.criarPersonagem();
        System.out.println(p1.toString() + " | " + p1.getArma().getTipo());
        p1.setArma(medieval.criarPunho());
        System.out.println(p1.toString() + " | " + p1.getArma().getTipo());        
        
        Personagem p2 = futurista.criarPersonagem();
        System.out.println(p2.toString() + " | " + p2.getArma().getTipo());
        p2.setArma(futurista.criarPunho());        
        System.out.println(p2.toString() + " | " + p2.getArma().getTipo());       
        
        p1.atacar(p2);
        p2.atacar(p1);
        
        p1.adicionarEscudo(medieval.criarDefesa(1));
        
        p1.atacar(p2);
        p2.atacar(p1);
    }
}
