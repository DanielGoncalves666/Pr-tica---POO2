package Strategy;

public class CorridaRapida implements Correr
{
    private static CorridaRapida instancia = null;
    
    private CorridaRapida(){}
    
    public static synchronized CorridaRapida getInstancia()
    {
        if(instancia == null)
            instancia = new CorridaRapida();
        
        return instancia;
    }
    
    public void correr()
    {
        System.out.print("Correr Rapido\n");
    }
}
