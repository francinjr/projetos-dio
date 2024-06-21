import java.util.ArrayList;
import java.util.List;

import banco.entidades.Banco;
import banco.entidades.Cliente;
import banco.entidades.Conta;
import banco.entidades.ContaCorrente;
import banco.entidades.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        // Instanciando um cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Francinaldo Manoel");

        Conta contaCorrente1 = new ContaCorrente(cliente1);
        Conta poupanca1 = new ContaPoupanca(cliente1);

        // Depositando, sacando e transferindo da conta corrente para a poupança em uma mesma conta (contas do cliente1)
        contaCorrente1.depositar(550);
        contaCorrente1.sacar(25);
        contaCorrente1.transferir(100, poupanca1);

        contaCorrente1.imprimirExtrato();
        poupanca1.imprimirExtrato();


        // Instanciando outro cliente
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ana Maria");

        Conta contaCorrente2 = new ContaCorrente(cliente2);
        Conta poupanca2 = new ContaPoupanca(cliente2);

        // Depositando e transferindo da conta corrente para a poupança em uma mesma conta (contas do cliente2)
        contaCorrente2.depositar(200);
        contaCorrente2.transferir(150, poupanca2);

        contaCorrente2.imprimirExtrato();
        poupanca2.imprimirExtrato();


        /* Depositando e transferindo da conta corrente para a poupança entre diferentes contas (da conta corrente do cliente1 para
        poupanca do cliente2) */
        contaCorrente1.transferir(100, poupanca2);

        contaCorrente1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        contaCorrente2.imprimirExtrato();
        poupanca2.imprimirExtrato();


        // Criando uma lista de contas para instanciar um banco
        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente1);
        contas.add(poupanca1);

        contas.add(contaCorrente2);
        contas.add(poupanca2);
        
        Banco banco = new Banco("Banco francinjr", contas);
        System.out.println(banco.listarTodosClientesEmOrdemAlfabetica());
    }

}