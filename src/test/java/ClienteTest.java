import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirExameCao() {
        FabricaAbstrata fabrica = new FabricaCao();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Exame para cachorro!", cliente.emitirExame());
    }

    @Test
    void deveEmitirExameGato() {
        FabricaAbstrata fabrica = new FabricaGato();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Exame para gato!", cliente.emitirExame());
    }

    @Test
    void deveEmitirExameHamster() {
        FabricaAbstrata fabrica = new FabricaHamster();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Exame para hamster!", cliente.emitirExame());
    }

    @Test
    void deveEmitirExameLontra() {
        FabricaAbstrata fabrica = new FabricaLontra();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Exame para lontra!", cliente.emitirExame());
    }

    @Test
    void deveEmitirHistoricoCao() {
        FabricaAbstrata fabrica = new FabricaCao();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Histórico para cachorro!", cliente.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoGato() {
        FabricaAbstrata fabrica = new FabricaGato();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Histórico para gato!", cliente.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoHamster() {
        FabricaAbstrata fabrica = new FabricaHamster();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Histórico para hamster!", cliente.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoLontra() {
        FabricaAbstrata fabrica = new FabricaLontra();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Histórico para lontra!", cliente.emitirHistorico());
    }

    @Test
    void deveEmitirReceitaCao() {
        FabricaAbstrata fabrica = new FabricaCao();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Receita para cachorro!", cliente.emitirReceita());
    }

    @Test
    void deveEmitirReceitaGato() {
        FabricaAbstrata fabrica = new FabricaGato();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Receita para gato!", cliente.emitirReceita());
    }

    @Test
    void deveEmitirReceitaHamster() {
        FabricaAbstrata fabrica = new FabricaHamster();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Receita para hamster!", cliente.emitirReceita());
    }

    @Test
    void deveEmitirReceitaLontra() {
        FabricaAbstrata fabrica = new FabricaLontra();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Receita para lontra!", cliente.emitirReceita());
    }

}