import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private ArrayList<Movimentacao> listaMovimentacoes;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.listaMovimentacoes = new ArrayList<>();
    }

    public void adicionarMovimentacao(Movimentacao movimentacao) {
        listaMovimentacoes.add(movimentacao);
    }

    public void exibirMovimentacoes() {
        System.out.println("Movimentações de " + nome + ":");
        for (Movimentacao movimentacao : listaMovimentacoes) {
            movimentacao.exibirDetalhes();
            System.out.println();
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
