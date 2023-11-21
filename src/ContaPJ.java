public class ContaPJ extends Conta {
    private double limiteEmprestimo;

    //construtor


    public ContaPJ() {
        super();
    }

    public ContaPJ(Integer numero, String nome, Double saldo, double limiteEmprestimo) {
        super(numero, nome, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double quantia){ //Metodo para emprestimo

        if(quantia <= limiteEmprestimo){ //Verifica se a quantia é possível para o Emprestimo

            saldo += quantia - 10.0; // desonto do saldo a quantia + 10 reais.
        }
    }

    @Override //Sobrescrita do método da superclasse
    public void saque(double quantia){

        super.saque(quantia);
        saldo -= 2.0;
    }


}
