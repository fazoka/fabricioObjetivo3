package fabricio.model;

public class ContaCorrente extends Conta implements AssociadoVip {
    public int qdeCotas;
    public double valorCota;
    public double total;



    public ContaCorrente() {super(); }

    public ContaCorrente(int id, double saldo, int qdeCotas, double valorCota) {
        super(id, saldo);
       this.qdeCotas = qdeCotas;
       this.valorCota = valorCota;
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
    public double lucros(int qdeCotas, double valorCota) {
        return this.total = qdeCotas * valorCota;

    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                ", id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}




