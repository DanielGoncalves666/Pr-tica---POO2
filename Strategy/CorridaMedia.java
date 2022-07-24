package Strategy;

public class CorridaMedia implements Correr
{
    private static CorridaMedia instancia = null;
    
    private CorridaMedia(){}
    
    public static synchronized CorridaMedia getInstancia()
    {
        if(instancia == null)
            instancia = new CorridaMedia();
        
        return instancia;
    }
    
    public void correr()
    {
        System.out.print("Correr Medio\n");
    }
}
