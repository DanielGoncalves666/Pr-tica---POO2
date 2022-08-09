package Personagem.Observer;

import Estados.Forte;
import Personagem.Personagem;
import Personagem.factory.FabricaMedieval;
import Strategy.AtaqueMedio;
import Strategy.CorridaMedia;
import Strategy.PuloMedio;

public class Inimigo extends Personagem{
    Observado jogador = null;
    
    public Inimigo(int x, int y)
    {
        this.setX(x);
        this.setY(y);
        this.setLife(50);
        this.setLifeState(Forte.getInstancia());
        this.setAtaque(AtaqueMedio.getInstancia());
        this.setCorrida(CorridaMedia.getInstancia());
        this.setPulo(PuloMedio.getInstancia());
        this.setArma(FabricaMedieval.getInstancia().criarArma(0));
        this.adicionarEscudo(FabricaMedieval.getInstancia().criarDefesa(3));   
    }
    
    public void setJogador(Observado o)
    {
        this.jogador = o;
    }
    
    public void update(Observado o)
    {
        if(jogador == null)
            setJogador(o);
        
        Personagem j = (Personagem)o; //(coerção de tipo) 
        
        if( Math.abs(this.getX() - j.getX()) < 2 && Math.abs(this.getY() - j.getY()) < 2)
        {
            System.out.println("Inimigo "+ this.toString() + " ataca.");
            this.atacar(j);
        }
        else 
        {
            // mover até o jogador
           if(j.getX() > this.getX())
               this.setX( this.getX() + (int) (5 * Math.random()));
           else
               this.setX( this.getX() - (int) (5 * Math.random()));
           
           if(j.getY() > this.getY())
               this.setY( this.getY() + (int) (5 * Math.random()));
           else
               this.setY( this.getY() - (int) (5 * Math.random()));
     
        }
    } 
    
}
