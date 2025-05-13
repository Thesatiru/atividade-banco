public class ContaBancaria {
    private String idDaConta;
    private String nomeDoUsuario;
    private double saldo;

    public ContaBancaria(String idDaconta, String nomeDoUsuario, double saldo){
        this.idDaConta = idDaconta;
        this.nomeDoUsuario = nomeDoUsuario;
        this.saldo = saldo;
    }

    public String getIdDaConta() {
        return idDaConta;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if (valor > saldo) {
            System.out.println("O valor é maior que o saldo!");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor){
        if (valor <= 0) {
            System.out.println("O valor precisa ser maior que ZERO");
        } else {
            saldo+= valor;
        }
    }

    public void tranferir(double valor, ContaBancaria contaOutra){
        if (valor > this.saldo ||this.saldo <= 0){
            System.out.println("ERRO!");
        }else {
            saldo-=valor;
            contaOutra.saldo += valor;
        }
    }

    @Override
    public String toString() {
        return "Nome: "+ this.nomeDoUsuario+"\nNúmero da conta: "+this.idDaConta+"\nSaldo: R$"+this.saldo;
    }
}