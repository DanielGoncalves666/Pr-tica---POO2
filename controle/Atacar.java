package controle;

//A camada de controle faz referencia (importa/depende) do modelo, mas e' independente da visao

import Personagem.Observer.*;


public class Atacar implements Command
{
    Jogador j;

    public Atacar(Jogador j){
       this.j = j;
    }    
    public void execute(){
      j.ataca();       
    }    
}
