package fabricio.model;

public final class ContaPoupanca extends Conta {


    public ContaPoupanca() {super(); }

    public ContaPoupanca(int id, double saldo) {
        super(id, saldo);

    }


    @Override
    public void deposita(double valor) {
        this.saldo = valor;

    }

    @Override
    public void saca(double valor) {
        this.saldo = saldo - valor;

    }

    @Override
    public void atualiza(double taxa) {
        this.saldo = saldo * taxa;

    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
