package Fases;

import Personagem.Personagem;
import Personagem.factory.FabricaFuturista;
import java.util.ArrayList;
import java.util.Random;

public class SalaRandomizada extends Sala {
    
    public SalaRandomizada(ArrayList<PhaseComponent> proximas, Personagem inimigo)
    {
        super(proximas,inimigo);
    }
    
    public SalaRandomizada(PhaseComponent caminho1, PhaseComponent caminho2, Personagem inimigo)
    {
        super(caminho1,caminho2,inimigo);
    }
    
    protected int selecionarCaminho()
    {
        Random generator = new Random();
        return generator.nextInt(proxima.size()); // entre 0 e o tamanho (exclusive)
    }
    
    protected boolean lutar(Personagem p)
    {
        
        if(inimigo == null)
           return true;
        
        Random generator = new Random();
        
        int gerado = 0; 
        
        while(true)
        {
            gerado = generator.nextInt(10) + 1;
            this.inimigo.sofrerDano(gerado * 3); // multiplicado para que seja factível matar o inimigo 
            
            if(!inimigo.getLifeState().getStatus())
            {
                //inimigo morreu
                inimigo = FabricaFuturista.getInstancia().criarInimigo(); // cria um novo inimigo 
                // seria ideal saber de qual fábrica veio o primeiro inimigo, mas como não sabemos aqui, coloquei uma fábrica qualquer
                break;
            }
            
            gerado =  generator.nextInt(10) + 1;//randômico entre 1 e 10
            
            this.inimigo.atacar(p); // o inimigo ataca em seguida
            
            if(!p.getLifeState().getStatus())
            {
                // jogador morreu
                return false;
            }
        }

        return true;
    }
}
