package aula03;

public class impressaoDeFatura {
    private Fatura fatura;

    public impressaoDeFatura(Fatura fatura){
        this.fatura = fatura;
    }
    public  void imprimirFatura(){
        System.out.println("Nome do livro: " + fatura.getLivro().getNome());
        System.out.println("Nome do autor: " + fatura.getLivro().getNomeAutor());
        System.out.println("Ano" + fatura.getLivro().getAno());
        System.out.println("Preço: " + fatura.getLivro().getPreço());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Total: " + fatura.getTotal());
    }

}
