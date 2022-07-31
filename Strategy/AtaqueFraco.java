package Strategy;

public class AtaqueFraco extends Ataque
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
