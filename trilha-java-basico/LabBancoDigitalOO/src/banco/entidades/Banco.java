package banco.entidades;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public Banco() {}


    public Set<String> listarTodosClientesEmOrdemAlfabetica() {
        Set<String> nomesClientes = new TreeSet<>();
        for(Conta c : this.contas) {
            nomesClientes.add(c.getCliente().getNome());
        }
        return nomesClientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
