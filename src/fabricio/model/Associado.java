package fabricio.model;

public class Associado implements AssociadoVip {
    private int id;
    public int qdeCotas;
    public double valorCota;
    public double total;

    public Associado() {

    }

    public Associado(int id, int qdeCotas, double valorCota) {
        this.id = id;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return this.total = qdeCotas * valorCota;

    }

    @Override
    public String toString() {
        return "Associado{" +
                "id=" + id +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                '}';
    }
}
