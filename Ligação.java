package telefone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligação {
    private String numeroOrigem;
    private String numeroDestino;
    private String horarioLigacao;


    public Ligação(String numeroOrigem, String numeroDestino) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino;
    }
    public Ligação (Contato contatoOrigem, Contato contatoDestino) {
        this.numeroOrigem = contatoOrigem.getNumero();
        this.numeroDestino = contatoDestino.getNumero();
    }

    public void ligar(){
        System.out.println("ligando para: " + numeroDestino);

        System.out.println("chamando........");
        System.out.println("O numero está ocupado ");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime hararioAgora = LocalDateTime.now();
        horarioLigacao = formatter.format(hararioAgora);
    }

    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    @Override
    public  String toString(){
        String informacao = String.format("Origem: %s\nDestino: %s\nHorario: %s", numeroOrigem, numeroDestino, horarioLigacao,
        numeroOrigem, numeroDestino, horarioLigacao);
        return informacao;

    }

    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }



}
