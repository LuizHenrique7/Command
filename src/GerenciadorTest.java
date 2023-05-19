import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadorTest {

    Gerenciador gerenciador;
    Computador computador;

    @BeforeEach
    void setUp() {
        gerenciador = new Gerenciador();
        computador = new Computador ("Processador: Intel Core i7-10700K, Memória RAM: 16GB DDR4, Armazenamento: SSD de 512GB, Placa de vídeo: NVIDIA GeForce RTX 3070", "EagleTech Pro");
    }

    @Test
    void deveLigarComputador() {
        Acao ligarComputador = new LigarComputador(computador);
        gerenciador.executarAcao(ligarComputador);

        assertEquals("Computador Ligado", computador.getStatus());
    }

    @Test
    void deveDesligarComputador() {

        Acao desligarComputador = new DesligarComputador(computador);
        gerenciador.executarAcao(desligarComputador);

        assertEquals("Computador Desligado", computador.getStatus());
    }

    @Test
    void deveCancelarDesligarComputador() {
        Acao ligarComputador = new LigarComputador(computador);
        Acao desligarComputador = new DesligarComputador(computador);

        gerenciador.executarAcao(ligarComputador);
        gerenciador.executarAcao(desligarComputador);

        gerenciador.cancelarUltimaAcao();

        assertEquals("Computador Ligado", computador.getStatus());
    }

}