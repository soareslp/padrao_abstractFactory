public class Cliente {

    private Exame exame;
    private Historico historico;
    private Receita receita;

    public Cliente(FabricaAbstrata fabrica) {
        this.exame = fabrica.createExame();
        this.historico = fabrica.createHistorico();
        this.receita = fabrica.createReceita();
    }

    public String emitirExame() {
        return this.exame.emitir();
    }

    public String emitirReceita() {
        return this.receita.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}
