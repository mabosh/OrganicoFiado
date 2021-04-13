package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.print("Informe o número do cliente: ");
		String numero = scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome, numero);
		
//		System.out.print("Informe o número do cliente: ");
//		String numero = scanner.nextLine();
//		Consumidor consumidor = new Consumidor(numero);
		
		System.out.print("Infome o valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		consumidor.registrarFiado(fiado);
		
		int total = consumidor.getFiado();
//		int total = somaWhile(consumidor.fiados);
		
		if (total > 100) {
			System.out.println("Cliente " + consumidor.getNome() + " De número: " + consumidor.getNumero() + " deve: " + total);
		} else {
			System.out.println("Cliente " + consumidor.getNome() + " De número: " + consumidor.getNumero() + " deve: " + total);
		}
	}
	
	
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;

	}

	public static int somaFor(int[] fiados) {
		int total = 0;
		for (int i = 0; i < fiados.length; i++) {
			total += fiados[i];

		}
		
		return total;
		
		}
	
	public static int somaForeach(int[] fiados) {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;				
		}
		
		return total;
	
	}

}