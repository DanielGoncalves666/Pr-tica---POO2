package Fases;

import Personagem.Personagem;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SalaEscolha extends Sala {
    
    public SalaEscolha(ArrayList<PhaseComponent> proximas, Personagem inimigo)
    {
        super(proximas,inimigo);
    }
    
    public SalaEscolha(PhaseComponent caminho1, PhaseComponent caminho2, Personagem inimigo)
    {
        super(caminho1,caminho2,inimigo);
    }
    
    protected int selecionarCaminho()
    {
        System.out.println("Existem " + proxima.size() + " caminhos possíveis.");
        
        Scanner sc = new Scanner(System.in);
        int prox = 0;
        
        do
        {
            System.out.println("Escolha um número entre 0 e " + (proxima.size() - 1) 
                + ".");
            
            prox = sc.nextInt();
        }
        while(prox < 0 || prox > proxima.size() - 1);
        
        return prox;
    }
    
    protected boolean lutar(Personagem p)
    {
        if(inimigo == null)
           return true;
        
        Random generator = new Random();
        Scanner sc = new Scanner(System.in);
        
        int gerado = 0; 
        int entrada = 0;
        
        System.out.println("Um número aleatório foi gerado entre 1 e 10. Adivinhe e vc vence.");
        gerado = generator.nextInt(10) + 1;

        entrada = sc.nextInt();
            
        if(gerado == entrada)
        {
            System.out.println("Certa resposta! O inimigo morreu e você pode prosseguir!");
            inimigo.sofrerDano(100);
            inimigo = null;
            return true;
        }
           
        System.out.println("Resposta errado. O inimigo irá sofrer " + entrada + " * 5 de dano antes do combate.");
        this.inimigo.sofrerDano(entrada * 5); // para ser factível matar o inimigo

        
        while(true)
        {
            p.atacar(this.inimigo);
            
            if(!inimigo.getLifeState().getStatus())
            {
                //inimigo morreu
                inimigo = null;
                break;
            }
                        
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
