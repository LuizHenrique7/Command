public class DesligarComputador implements Acao {

    private Computador computador;

    public DesligarComputador(Computador computador) {
        this.computador = computador;
    }

    public void executar() {
        this.computador.desligarComputador();
    }

    public void cancelar() {
        this.computador.ligarComputador();
    }
}
