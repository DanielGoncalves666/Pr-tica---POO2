package Strategy;

public class AtaqueMedio implements Ataque
{
    private static AtaqueMedio instancia = null;
    
    private AtaqueMedio(){}
    
    public static synchronized AtaqueMedio getInstancia()
    {
        if(instancia == null)
            instancia = new AtaqueMedio();
        
        return instancia;
    }
    
    public int ataque()
    {
        System.out.print("Ataque Medio\n");
        return 10;
    }
}
