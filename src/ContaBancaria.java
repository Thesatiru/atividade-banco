public class ContaBancaria {
    private String idDaConta;
    private String nomeDoUsuario;
    private double saldo;

    public ContaBancaria(String idDaconta, String nomeDoUsuario, double Saldo){
        this.idDaConta = idDaconta;
        this.nomeDoUsuario = nomeDoUsuario;
        this.saldo = saldo;
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
}