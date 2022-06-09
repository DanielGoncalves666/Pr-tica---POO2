public class Principal
{
    public static void main(String args[])
    {
        Personagem Mario = new Personagem01();
        Personagem Douglas = new Personagem02();
        Personagem Larissa = new Personagem03();
    
        Mario.atacar();
        Mario.correr();
        Mario.pular();
        
        Douglas.atacar();
        Douglas.correr();
        Douglas.pular();
        
        Larissa.atacar();
        Larissa.correr();
        Larissa.pular();
        
    }
}