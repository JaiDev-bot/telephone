package telefone;

public class Contato {
    private String name;
    private String numero;

    public Contato(String name, String numero){
        this.name= name;
        this.numero=numero;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getNumero(){
        return numero;

    }

    public void setNumero(String numero){
        this.numero=numero;
    }

        @Override
        public String toString(){
        String informaçao= String.format("Nome: %s\nNumero: %s", name, numero);
        return informaçao;
    }
}
