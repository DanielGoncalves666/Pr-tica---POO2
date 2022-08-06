package Fases;

import Personagem.Personagem;
import java.util.ArrayList;
import java.util.Random;

public class Sala implements PhaseComponent{
    
    private ArrayList<PhaseComponent> proxima;
    private Personagem inimigo;
    
    // salas com qualquer número de caminhos. Se um arraylist for passado, uma única saida é incluida.
    public Sala(ArrayList<PhaseComponent> proximas, Personagem inimigo)
    {
        proxima = new ArrayList();

        if(proximas.isEmpty())
        {
            PhaseComponent a = new Saida();
            proxima.add(a);
        }
        else
            proxima.addAll(proximas);            
            
        this.inimigo = inimigo;
    }
    
    // salas com dois caminhos
    public Sala(PhaseComponent caminho1, PhaseComponent caminho2, Personagem inimigo)
    {
        proxima = new ArrayList();
        proxima.add(caminho1);
        proxima.add(caminho2);
        
        this.inimigo = inimigo;
    }
    
    public void jogar(Personagem p)
    {
        this.statusInicial(p);
        
        boolean sobreviveu = combate(p);
        
        if(!sobreviveu)
        {
            System.out.println("O jogador morreu para " + this.inimigo.toString().substring(0, this.inimigo.toString().indexOf('@')));
            return;
        }
        
        Random generator = new Random();
        int destino = generator.nextInt(proxima.size()); // entre 0 e o tamanho (exclusive)
        
        this.statusFinal(p);
        proxima.get(destino).jogar(p); // o jogador entra na próxima sala
    }
    
    // retorna true se o personagem sobreviver
    public boolean combate(Personagem p)
    {
        if(inimigo == null)
            return true;
               
        while(true)
        {
            p.atacar(this.inimigo); // o jogador ataca primeiro
            
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
    
    public void statusInicial(Personagem p)
    {
        String id = p.toString().substring(0, p.toString().indexOf('@'));
        System.out.println("Personagem: "+id);        
        
        try
        {
            String ini = this.inimigo.toString().substring(0, this.inimigo.toString().indexOf('@'));
            System.out.println("Inimigo: "+ini);    
            
            try
            {
                String arma = this.inimigo.getArma().toString().substring(0, this.inimigo.getArma().toString().indexOf('@'));
                System.out.println("\tArma: "+arma);        
            }
            catch(Exception e)
            {
                System.out.println("\tArma: nenhuma");
             }
        }
        catch(Exception e)
        {
            System.out.println("Inimigo: nenhum vivo.");
        }
        
        System.out.println("Vida Inicial do personagem: "+p.getLife());
    }
    
    public void statusFinal(Personagem p)
    {
        System.out.println("Vida Final do personagem: " + p.getLife() + "\n");
    }
}
