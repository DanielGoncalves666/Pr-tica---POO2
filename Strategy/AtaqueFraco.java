package Strategy;

public class AtaqueFraco implements Ataque
{
    private static AtaqueFraco instancia = null;
    
    private AtaqueFraco(){}
    
    public static synchronized AtaqueFraco getInstancia()
    {
        if(instancia == null)
            instancia = new AtaqueFraco();
        
        return instancia;
    }
    
    public int ataque()
    {
        System.out.print("Ataque fraco\n");
        return 5;
    }
}
