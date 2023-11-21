public class Conta {

    private Integer numero;
    private String nome;

    protected Double saldo;

    public Conta(){ }

    //Métodos construtuores
    public Conta(Integer numero, String nome, Double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    //Métodos Acessores


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    //public void setSaldo(Double saldo) {
     //   this.saldo = saldo;

    //Método de saque

    public void saque(double quantia){
        saldo -= quantia + 5.0;
    }

    //Método de deposito

    public void deposito(double quantia){

        saldo += quantia;
    }

}
