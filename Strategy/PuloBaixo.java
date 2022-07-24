package Strategy;

public class PuloBaixo implements Pulo
{
    private static PuloBaixo instancia = null;
    
    private PuloBaixo(){}
    
    public static synchronized PuloBaixo getInstancia()
    {
        if(instancia == null)
            instancia = new PuloBaixo();
        
        return instancia;
    }
    
    public void pular()
    {
        System.out.print("Pulo baixo\n");
    }
}
