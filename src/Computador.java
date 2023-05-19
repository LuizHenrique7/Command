public class Computador {

    private String especificacao;
    private String computador;
    private String status;

    public Computador(String especificacao, String computador) {
        this.especificacao = especificacao;
        this.computador = computador;
    }

    public String getStatus() {
        return status;
    }

    public void ligarComputador() {
        this.status = "Computador Ligado";
    }

    public void desligarComputador() {
        this.status = "Computador Desligado";
    }
}
