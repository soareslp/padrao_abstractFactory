public class FabricaHamster implements FabricaAbstrata{
    @Override
    public Receita createReceita() {
        return new ReceitaHamster();
    }

    @Override
    public Exame createExame() {
        return new ExameHamster();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoHamster();
    }
}
