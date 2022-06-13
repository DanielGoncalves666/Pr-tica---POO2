import Strategy.*;
import Escudos.*;

/**
 * Classe abstrata Personagem
 */

public class Personagem
{
    private int Life;
    private LifeState vida;
    private Escudo prox;
    
    private Ataque atk;
    private Correr run;
    private Pulo jump;
    
    public Personagem()
    {
        this.setLife(70);
        this.setLifeState(new Normal(this));
        this.setPulo(new PuloMedio()); // para nao ficar incompleto
        this.prox = null; // indica que nao ha escudos
    }
    
    public void sofrerDano(int dano)
    {
        int novoDano = dano;
        
        if(prox != null) // se houver um escudo equipado
        {
            novoDano = prox.processaDefesa(dano);  
            System.out.print("** " + (dano - novoDano) + " Defendido\n");
        }
        
        this.vida.sofrerDano(novoDano);
        System.out.print("-" + novoDano + "HP\n");
    }
    
    public void recuperarVida(int recuperar)
    {
        this.vida.recuperarVida(recuperar);
        System.out.print("+" + recuperar + "HP\n");
    }
    
    public int atacar()
    {
        return this.atk.ataque();    
    }
    
    public void correr()
    {
        this.run.correr();
    }
    
    public void pular()
    {
        this.jump.pular();
    }
    
    public void setAtaque(Ataque novo)
    {
        this.atk = novo;
    }
    
    public void adiconarPoderAtaque(int tipo)
    {
        switch(tipo)
        {
            case 1:// fogo
                atk = new Fogo(atk);
                break;
            case 2:// gelo
                atk = new Gelo(atk);
                break;
            case 3:// trovao
                atk = new Trovao(atk);
                break;
            default:// invalido
                // faz nada
                break;
        }
    }
    
    public void setCorrida(Correr nova)
    {
        this.run = nova;
    }
    
    public void setPulo(Pulo novo)
    {
        this.jump = novo;
    }
    
    public void setLife(int valor)
    {
        if(valor < 0)
            this.Life = 0;
        else if(valor > 100)
            this.Life = 100;
        else      
            this.Life = valor;
    }
    
    public void setLifeState(LifeState novo)
    {
        this.vida = novo;
    }
    
    public LifeState getLifeState()
    {
        return this.vida;
    }
    
    public void printLifeState()
    {
        System.out.print(this.vida.toString().substring(0, this.vida.toString().indexOf('@')) + "\n");
    }

    public int getLife()
    {
         return this.Life;   
    }
    
    public void adicionarEscudo(Escudo novo)
    {
        // o primeiro escudo adicionado sera o ultima da lista
        novo.setProx(this.prox);
        this.prox = novo;
    }
}
