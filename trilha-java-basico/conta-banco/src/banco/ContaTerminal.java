package banco;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o seu nome");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite sua agência");
		String agencia = sc.nextLine();
		
		System.out.println("Por favor, digite o número da agência");
		Integer numero = sc.nextInt();
		
		sc.nextLine();
		
		/* Nessa parte de pegar o valor inicial do depósito e colocar no saldo, fiz uma implementação 
		 * extra. Realizei validações para o valor do depósito inicial.
		*/
		String mensagemValidacaoSaldo = "Por favor, digite um valor inicial para depósito, o valor digitado "
				+ "deve considerar os centavos no formato correto(com duas casas decimais), por exemplo,"
				+ " digite 588.89 para depositar R$ 588,89";
		
		System.out.println(mensagemValidacaoSaldo);
		
		BigDecimal saldo = new BigDecimal("-123.459");
		
		
		while (saldo.scale() != 2 || saldo.compareTo(BigDecimal.ZERO) < 0) {
			saldo = sc.nextBigDecimal();
			
			if(saldo.scale() != 2) {
				System.out.println("O valor digitado para o depósito possui " + saldo.scale()
				+ " casas decimais " + mensagemValidacaoSaldo);
			}
			
			if(saldo.compareTo(BigDecimal.ZERO) < 0) {
				System.out.println("O valor do depósito deve ser maior que R$ 0,00");
			}
		}
		
		sc.close();
        
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,"
				+ " sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo
				+ " já está disponível para saque.");
	}
}
