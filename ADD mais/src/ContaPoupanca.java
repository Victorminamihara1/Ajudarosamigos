public class ContaPoupanca extends Conta{
    private double taxaJuro;

    public ContaPoupanca() { super();}

    public ContaPoupanca(Integer numero, String nome, Double saldo, double taxaJuro) {
        super(numero, nome, saldo);
        this.taxaJuro = taxaJuro;
    }

    public double getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }
    public void atualizaSaldo(){

        saldo += saldo * taxaJuro;
    }

    @Override
    public void saque(double quantia){

        saldo -= quantia;
    }
}
