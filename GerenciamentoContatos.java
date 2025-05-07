package telefone;

import java.util.ArrayList;

public class GerenciamentoContatos {
    private ArrayList<Contato> contatos;

    public GerenciamentoContatos() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionar(String name, String numero){
    Contato newcontato = new Contato(name, numero);
    contatos.add(newcontato);
    }

    public void adicionar(Contato newConatto){
        contatos.add(newConatto);
    }

    public GerenciamentoContatos buscar(String palavaraChave){
        String palavraChaveMinusculo = palavaraChave.toLowerCase();
       GerenciamentoContatos contatosFiltrados = new GerenciamentoContatos();
       for (Contato contato : contatos) {
           String nomeContatoMinusculo = contato.getName().toLowerCase();
           if(nomeContatoMinusculo.startsWith(palavraChaveMinusculo)){
               contatosFiltrados.adicionar(contato);}
       }

       return contatosFiltrados;
    }


    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        String informacao = "Contatos: \n";
        for (Contato contato : contatos) {
            informacao += contato.toString() + "\n";
        }


        return informacao;
        }





}
