package telefone;

public class Telefone {
    private String numero;
    private GerenciamentoContatos gerenciamentoContatos;
    private Chamadas chamadas;



    public Telefone(String numero){
        this.numero = numero;
        this.gerenciamentoContatos = new GerenciamentoContatos();
        this.chamadas = new Chamadas();
    }

    public void ligar(String numeroDestino ){
        Ligação ligação = new Ligação(numero, numeroDestino);
        ligação.ligar();
        chamadas.adicionar(ligação);
    }

    public void ligar(Contato contatoDestino ){
       ligar( contatoDestino.getNumero());
    }



    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public GerenciamentoContatos getGerenciamentoContatos() {
        return gerenciamentoContatos;
    }

    public void setGerenciamentoContatos(GerenciamentoContatos gerenciamentoContatos) {
        this.gerenciamentoContatos = gerenciamentoContatos;
    }

    public Chamadas getChamadas() {
        return chamadas;
    }
}


