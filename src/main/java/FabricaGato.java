public class FabricaGato implements FabricaAbstrata {
    @Override
    public Receita createReceita() {
        return new ReceitaGato();
    }

    @Override
    public Exame createExame() {
        return new ExameGato();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoGato();
    }
}
