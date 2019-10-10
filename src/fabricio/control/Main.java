package fabricio.control;

import fabricio.model.Associado;
import fabricio.model.Conta;
import fabricio.model.ContaCorrente;
import fabricio.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ContaPoupanca contapoupaca1 = new ContaPoupanca(1, 200);
        ContaPoupanca contapoupaca2 = new ContaPoupanca(2, 400);
        ContaPoupanca contapoupaca3 = new ContaPoupanca(3, 600);
        System.out.println("\n********** Conta poupança:" + contapoupaca1 +  contapoupaca2 +  contapoupaca3);

        ContaCorrente contaCorrente1 = new ContaCorrente(1, 100, 100, 50);
        ContaCorrente contaCorrente2 = new ContaCorrente(2, 200, 200, 60);
        ContaCorrente contaCorrente3 = new ContaCorrente(3, 300, 300, 70);
        System.out.println("\n********** Conta corrente:" + contaCorrente1 +  contaCorrente2 +  contaCorrente3);

        Associado associado1 = new Associado(1, 300, 97);
        Associado associado2 = new Associado(2, 400, 98);
        Associado associado3 = new Associado(3, 500, 99);
        System.out.println("\n********** Associado:" + associado1 +  associado2 +  associado3);

        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente1);
        contas.add(contaCorrente2);
        contas.add(contaCorrente3);
        contas.add(contapoupaca1);
        contas.add(contapoupaca2);
        contas.add(contapoupaca3);
        System.out.println("\n********** Funcionários (na ordem de inserção na coleção):\n" + contas);

        List<Associado> associados = new ArrayList<>();
        associados.add(associado1);
        associados.add(associado2);
        associados.add(associado3);
        System.out.println("\n********** Funcionários (na ordem de inserção na coleção):\n" + associados);

        contapoupaca1.deposita(1000);
        contapoupaca1.atualiza(0.5);
        contapoupaca1.saca(300);

        contaCorrente1.deposita(500);
        contaCorrente1.saca(400);

        associado1.qdeCotas()


    }

}
