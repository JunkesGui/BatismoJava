package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo, String titular) {
        super(saldo, titular);
        this.tipo = TipoConta.CORRENTE;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Foram depositados %.2f na conta corrente de %s\n", valor, titular);
    }
}
