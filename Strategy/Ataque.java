package Strategy;

public abstract class Ataque
{
    public abstract int ataque();
    
    // métodos usados pela máquina de estados de modo a evitar a perda de decoradores
    public Ataque getProx()
    {
        return null;
    }
    public void setProx(Ataque a){} // gancho (ideia retirada do Template Method)
                                    // sobrescrito apenas pela classe abstrata PoderAtaque
}
