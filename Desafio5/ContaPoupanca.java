package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo, String titular) {
        super(saldo, titular);
        this.tipo = TipoConta.POUPANCA;
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Aviso, esta operação deduzirá 1% do valor a ser depositado");
        valor = valor-valor*0.01;
        saldo += valor;
        System.out.printf("Foram depositados %.2f na poupança de %s\n", valor, titular);
    }

    public void rendimento(){
        saldo += saldo*0.001;
        System.out.printf("A conta rendeu juros, e seu novo saldo é %.2f\n",saldo);
        System.out.println("(Era melhor ter investido em um CDB de Konoha)");
    }
}
