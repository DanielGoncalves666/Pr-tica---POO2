package controle;
import Personagem.Observer.Jogador;
import Personagem.Personagem;

//A camada de controle faz referencia (importa/depende) do modelo, mas e' independente da visao

public class MoverBaixo implements Command
{
    private Jogador j;
    public MoverBaixo(Jogador j){
        this.j = j;
    }    
    
    public void execute(){
        j.moverBaixo();           
    }    
    
}
