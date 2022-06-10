package Strategy;

public class AtaqueFraco implements Ataque
{
    public int ataque()
    {
        System.out.print("Ataque fraco\n");
        return 5;
    }
}
