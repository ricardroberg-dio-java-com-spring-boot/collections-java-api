package map.Ordenacao;

public class Evento {

    private String nome;
    private String atracao;

    public Evento(String nomeEvento, String nomeAtracao) {
        this.nome = nomeEvento;
        this.atracao = nomeAtracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeEvento='" + nome + '\'' +
                ", nomeAtracao='" + atracao + '\'' +
                '}';
    }
}
