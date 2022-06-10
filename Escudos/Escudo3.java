package Escudos;

public class Escudo3 extends Escudo
{
    public double processaDefesa(double ataque)
    {
        ataque -= 3;
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
