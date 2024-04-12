package aula03;

    public class Fatura {

        private  Livro livro;
        private  Integer quantidade;
        private  Double total;


        public Fatura(Livro livro, Integer quantidade, Double total){
            this.livro = livro;
            this.quantidade = quantidade;
            this.total = this.calcularTotal();
        }

        public Double calcularTotal(){
            return (double)(livro.getPreço() * quantidade);
        }

        public Livro getLivro() {
            return livro;
        }

        public void setLivro(Livro livro) {
            this.livro = livro;
        }

        public Integer getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
        }

        public Double getTotal() {
            return total;
        }

        public void setTotal(Double total) {
            this.total = total;
        }
    }



