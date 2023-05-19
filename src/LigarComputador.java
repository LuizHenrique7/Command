public class LigarComputador implements Acao {

    private Computador computador;

    public LigarComputador(Computador computador) {
        this.computador = computador;
    }

    public void executar() {
        this.computador.ligarComputador();
    }

    public void cancelar() {
        this.computador.desligarComputador();
    }
}
