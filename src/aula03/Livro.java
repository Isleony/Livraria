package aula03;

public class Livro {
    private String nome;
    private  String nomeAutor;
    private  Integer ano;
    private  Integer preço;

    public Livro(String nome, String nomeAutor, Integer ano, Integer preço){
        this.nome = nome;
        this.nomeAutor = nomeAutor;
        this.ano = ano;
        this.preço = preço;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getPreço() {
        return preço;
    }

    public void setPreço(Integer preço) {
        this.preço = preço;
    }
}
