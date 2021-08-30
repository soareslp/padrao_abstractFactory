public class FabricaCao implements FabricaAbstrata{
    @Override
    public Receita createReceita() {
        return new ReceitaCao();
    }

    @Override
    public Exame createExame() {
        return new ExameCao();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoCao();
    }
}
