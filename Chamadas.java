package telefone;

import java.util.ArrayList;

public class Chamadas {

    private ArrayList<Ligação> chamadas;

    public  Chamadas(){
        this.chamadas = new ArrayList<Ligação>();
    }

    public void adicionar(Ligação ligação){
        this.chamadas.add((ligação));
    }

    @Override
    public String toString() {
        String informacao = "Chamadas: \n";
        for (Ligação ligacao : chamadas) {
            informacao += ligacao.toString() + "\n";
        }
        return informacao;


    }
}
