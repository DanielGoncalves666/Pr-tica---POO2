package Strategy;

public class CorridaDevagar implements Correr
{
    private static CorridaDevagar instancia = null;
    
    private CorridaDevagar(){}
    
    public static synchronized CorridaDevagar getInstancia()
    {
        if(instancia == null)
            instancia = new CorridaDevagar();
        
        return instancia;
    }
    
    public void correr()
    {
        System.out.print("Correr Devagar\n");
    }
}
