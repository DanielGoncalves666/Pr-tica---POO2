package Personagem.Observer;

import Estados.Forte;
import Personagem.Personagem;
import Personagem.factory.FabricaMedieval;
import Strategy.AtaqueForte;
import Strategy.CorridaMedia;
import Strategy.PuloMedio;
import java.util.ArrayList;

public class Jogador extends Personagem implements Observado{

    private ArrayList<Inimigo> lista = new ArrayList<Inimigo>();
    private boolean mudou = false;
    
    public Jogador(int x, int y)
    {
        this.setX(x);
        this.setY(y);
        this.setLife(100);
        this.setLifeState(Forte.getInstancia());
        this.setAtaque(AtaqueForte.getInstancia());
        this.setCorrida(CorridaMedia.getInstancia());
        this.setPulo(PuloMedio.getInstancia());
        this.setArma(FabricaMedieval.getInstancia().criarArma(0));
        this.adicionarEscudo(FabricaMedieval.getInstancia().criarDefesa(3));
        this.adicionarEscudo(FabricaMedieval.getInstancia().criarDefesa(3));
        this.mudou = false;
        
    }
    
    public void registrarObservador(Inimigo o) 
    {
        lista.add(o);
        o.update(this);
    }

    public void removerObservador(Inimigo o) 
    {
        lista.remove(o);
    }

    public void notificarObservador()
    {
        if( hasChanged())
        {
            for(Inimigo o: lista)
                o.update(this);
            this.mudou = false;
        }
    }

    public void setPos(int x, int y)
    {
        this.setX(x);
        this.setY(y);
        this.notificarObservador();
    }
    
    public boolean hasChanged()
    {
        return mudou;
    }
    
    public void mudou()
    {
        this.mudou = true;
        this.notificarObservador();
    }
    
    public void ataca()
    {
        for(Inimigo o: lista)
        {
            Personagem i = (Personagem)o;
            double dist = Math.sqrt( Math.pow( (this.getX() - i.getX()), 2) + Math.pow( (this.getY() - i.getY()), 2));
            
            if(dist <= 50)
            {
                this.atacar(i);
                if(i.getLife() == 0)
                    removerObservador((Inimigo) i);
            }
        }
    }
    
    
    
    
    // ctrl c + ctrl v
    public void moverEsq(){
        setX(getX()-10);
        this.mudou = true;
    }
    
    public void moverDir(){
        setX(getX()+10);
        this.mudou = true;        
    }
    
    public void moverCima(){
        setY(getY()-10);
        this.mudou = true;        
    }

    public void moverBaixo(){
        setY(getY()+10);
        this.mudou = true;        
    }
    
}
