package Strategy;

public abstract class Ataque
{
    public abstract double ataque(); // retorna o modificar de ataque (x0.5 x1.0 ou x1.5)
    
    // métodos usados pela máquina de estados de modo a evitar a perda de decoradores
    public Ataque getProx()
    {
        return null;
    }
    public void setProx(Ataque a){} // gancho (ideia retirada do Template Method)
                                    // sobrescrito apenas pela classe abstrata PoderAtaque
}
