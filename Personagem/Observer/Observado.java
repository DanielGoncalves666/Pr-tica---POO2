package Personagem.Observer;

public interface Observado {    
    public abstract void registrarObservador(Inimigo o);
    public abstract void removerObservador(Inimigo o);
    public abstract void notificarObservador();
}
