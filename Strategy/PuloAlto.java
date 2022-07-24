package Strategy;

public class PuloAlto implements Pulo
{
    private static PuloAlto instancia = null;
    
    private PuloAlto(){}
    
    public static synchronized PuloAlto getInstancia()
    {
        if(instancia == null)
            instancia = new PuloAlto();
        
        return instancia;
    }
    
    public void pular()
    {
        System.out.print("Pulo Alto\n");
    }
}
