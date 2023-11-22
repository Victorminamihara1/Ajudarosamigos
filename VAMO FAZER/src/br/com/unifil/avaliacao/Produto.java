package br.com.unifil.avaliacao;

public class Produto{

    //VIII - Atributos

    private String nome;

    protected double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {

    }

    // V - Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    // II - Sobrecarga
    public String toString(){

        return "Nome do produto: "+
                nome+
                ",\nPreco do produto: "+
                preco;

    }
}
