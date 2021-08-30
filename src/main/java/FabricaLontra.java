public class FabricaLontra implements FabricaAbstrata{
    @Override
    public Receita createReceita() {
        return new ReceitaLontra();
    }

    @Override
    public Exame createExame() {
        return new ExameLontra();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoLontra();
    }
}
