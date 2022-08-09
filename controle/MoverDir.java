package controle;

//A camada de controle faz referencia (importa/depende) do modelo, mas e' independente da visao

import Personagem.Observer.Jogador;


public class MoverDir implements Command
{
    private Jogador j;
    public MoverDir(Jogador j){
        this.j = j;
    }    
    
    public void execute(){
        j.moverDir();           
    }    
    
}
