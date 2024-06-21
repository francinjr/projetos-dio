package banco.entidades;

import banco.excecoes.SaldoInsuficienteException;

public interface IConta {
	
	void sacar(double valor) throws SaldoInsuficienteException;
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino) throws Exception;
	
	void imprimirExtrato();
}
