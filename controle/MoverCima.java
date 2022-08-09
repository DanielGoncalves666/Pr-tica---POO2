package controle;

//A camada de controle faz referencia (importa/depende) do modelo, mas e' independente da visao

import Personagem.Observer.Jogador;

public class MoverCima implements Command
{
    private Jogador j;
    public MoverCima(Jogador j){
        this.j = j;
    }    
    
    public void execute(){
        j.moverCima();           
    }    
    
}
