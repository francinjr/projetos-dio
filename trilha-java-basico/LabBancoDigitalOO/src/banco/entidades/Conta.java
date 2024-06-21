package banco.entidades;

import banco.excecoes.SaldoInsuficienteException;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if(valor <= 0) {
			throw new IllegalArgumentException("O valor a ser sacado precisa ser positivo.");
		}
		if(this.getSaldo() < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente.");
		}
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("O valor a ser depositado precisa ser positivo.");
		}
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) throws Exception {
		if(contaDestino != null) {
			try {
				this.sacar(valor);
				contaDestino.depositar(valor);
			} catch(Exception e) {
				throw new Exception("Não foi possível realizar a transferência. " + e.getMessage());
			}
		}
	}

	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f\n", this.saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
