package Escudos;

public class Escudo2 extends Escudo
{
    public double processaDefesa(double ataque)
    {
        ataque -= 2;
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
