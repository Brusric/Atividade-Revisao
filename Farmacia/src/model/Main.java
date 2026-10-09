package model;
import model.Farmacia;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nomeMedicamentos = {"m1", "m2", "m3"};
		int[] DiasParaVencimento = {2, 10, 5, 20};
		double[] precos = {29.3, 10.5, 45.5, 5.25};
		Farmacia f1 = new Farmacia(nomeMedicamentos, DiasParaVencimento, precos);
		int opcao = 0;
		do {
			System.out.println("===MENU===");
			System.out.println("1. Mostrar medicamentos");
			System.out.println("2. Média de vencimentos");
			System.out.println("3. Vencimentos Próximos");
			System.out.println("4. Aplicar descontos");
			System.out.println("5. Comprar");
			System.out.println("0. Sair");
			System.out.print("Digite a opção: ");
			opcao = scan.nextInt();
			switch (opcao) {
				case 1:
					f1.mostrar();
					break;
				case 2:
					f1.CalcularMediaDias();
					break;
				case 3:
					f1.ProxVencimento();
					break;
				case 4:
					f1.Desconto();
					break;
				case 5:
					f1.venda();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		} while (opcao!=0);
	}
}
