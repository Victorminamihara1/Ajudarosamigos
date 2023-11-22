package br.com.unifil.avaliacao;

public class ProdutoImportado extends Produto{

    private double taxaAlfandega;

    public ProdutoImportado(String nome, double preco, double taxa){super ();}

    public ProdutoImportado(double taxaAlfandega) {
        super();
        this.taxaAlfandega = taxaAlfandega;
    }

    public ProdutoImportado() {

    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public void taxa(double valor){

        taxaAlfandega += valor + valor/10;

    }

    public String toString(){

        return "Taxa de Importação: "+
                taxaAlfandega;

    }
}
