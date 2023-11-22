package br.com.unifil.avaliacao;

public class ProdutoUsado {

    private String data;

    public ProdutoUsado(String data) {
        this.data = data;
    }

    public ProdutoUsado() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String dataDoProduto(){

        return data;

    }

    public String toString(){

        return "Data: "+
                data;
    }
}
