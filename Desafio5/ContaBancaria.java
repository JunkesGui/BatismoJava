package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipo;
    String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("Saldo atual: %.2f\n", saldo);
    }

    //Transferir para Conta Corrente
    public void transferir(double valor, ContaCorrente destino) {
        System.out.printf("Foram retirados %.2f na conta de %s\n", valor, titular);
        this.saldo -= valor;
        destino.depositar(valor);
    }

    //Transferir para Conta Poupanca
    public void transferir(double valor, ContaPoupanca destino) {
        System.out.printf("Foram retirados %.2f na conta de %s\n", valor, titular);
        this.saldo -= valor;
        destino.depositar(valor);
    }
}
