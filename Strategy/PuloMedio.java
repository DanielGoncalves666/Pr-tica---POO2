package Strategy;

public class PuloMedio implements Pulo
{
    private static PuloMedio instancia = null;
    
    private PuloMedio(){}
    
    public static synchronized PuloMedio getInstancia()
    {
        if(instancia == null)
            instancia = new PuloMedio();
        
        return instancia;
    }
    
    public void pular()
    {
        System.out.print("Pulo Medio\n");
    }
}
