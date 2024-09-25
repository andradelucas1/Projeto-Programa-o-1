enum TipoMovimentacao {
    RECEITA, DESPESA, INVESTIMENTO
}

public class Movimentacao {
    private TipoMovimentacao tipoMovimentacao;
    private String data;
    private double valor;
    private String categoria;
    private String destino;
    private String descricao;

    public Movimentacao(TipoMovimentacao tipoMovimentacao, String data, double valor, String categoria, String destino, String descricao) {
        this.tipoMovimentacao = tipoMovimentacao;
        this.data = data;
        this.valor = valor;
        this.categoria = categoria;
        this.destino = destino;
        this.descricao = descricao;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDestino() {
        return destino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void exibirDetalhes() {
        System.out.println("Tipo: " + tipoMovimentacao);
        System.out.println("Data: " + data);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Destino: " + destino);
        System.out.println("Descrição: " + descricao);
    }
}
