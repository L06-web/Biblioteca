package br.edu.unisep.biblioteca.model;

public class Emprestimo {
    private int id;
    private Livro livro;
    private Usuario usuario;
    private String dataemprestimo;
    private String datadevolucao;
    public Emprestimo() {
    }
    public Emprestimo (int id, Livro livro, Usuario usuario, String dataemprestimo, String datadevolucao) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataemprestimo = dataemprestimo;
        this.datadevolucao = datadevolucao;
    }
  //
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getdataemprestimo() {
        return dataemprestimo;
    }
    public void setdataemprestimo(String dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }
    public String getDataDevolucao() {
        return datadevolucao;
    }
    public void setdatadevolucao(String datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

}