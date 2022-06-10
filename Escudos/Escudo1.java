package Escudos;

public class Escudo1 extends Escudo
{
    public int processaDefesa(int ataque)
    {
        ataque -= 1;
        if(ataque < 0)
            ataque = 0;
        
        if(ataque == 0 || getProx() == null)
        {
            return ataque;// retorna o ataque que conseguiu passar pelos escudos
        }
        else
        {
            return getProx().processaDefesa(ataque);
        }
    }
}
