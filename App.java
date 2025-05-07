import telefone.Contato;
import telefone.GerenciamentoContatos;
import telefone.Ligação;
import telefone.Telefone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
    Telefone telefone = new Telefone("11 45454 4554");

        Contato contato01 = new Contato("Jaiane", "45 52412 5454");
        Contato contato02 = new Contato("Anna", "46 52412 5454");
        Contato contato03 = new Contato("Lucas", "49 52412 5454");
        Contato contato04 = new Contato("Janaina", "50 52412 5454");

        GerenciamentoContatos telefoneContatos = new GerenciamentoContatos();
        telefoneContatos.adicionar(contato01);
        telefoneContatos.adicionar(contato02);
        telefoneContatos.adicionar(contato03);
        telefoneContatos.adicionar(contato04);
        System.out.println(telefoneContatos);

        System.out.println("Contatos filtrados: ");
        System.out.println(telefoneContatos.buscar("j"));

        telefone.ligar(contato01);
        System.out.println(telefone.getChamadas());
    }
}