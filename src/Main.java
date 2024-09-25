public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Lucas Emanuel", "emanuellucasandrade@gmail.com");

        Movimentacao mov1 = new Movimentacao(TipoMovimentacao.RECEITA, "2024-09-10", 3000, "Salário", "Conta Corrente", "Recebimento de Salário");
        Movimentacao mov2 = new Movimentacao(TipoMovimentacao.DESPESA, "2024-09-11", 1000, "Aluguel", "Apartamento", "Pagamento de Aluguel");
        Movimentacao mov3 = new Movimentacao(TipoMovimentacao.INVESTIMENTO, "2024-09-12", 500, "Ações", "Bolsa de Valores", "Compra de Ações");

        usuario1.adicionarMovimentacao(mov1);
        usuario1.adicionarMovimentacao(mov2);
        usuario1.adicionarMovimentacao(mov3);

        usuario1.exibirMovimentacoes();
    }
}
