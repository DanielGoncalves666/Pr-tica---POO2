package Escudos;

public class CampoMagneticoMedio extends Escudo {
    
    public int processaDefesa(int ataque)
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
