package model;
import java.util.Scanner;

public class Farmacia {
	public String[] nomeMedicamentos = new String[3];
	public int[] DiasParaVencimento = new int[3];
	public double[] precos = new double[3];
	
	Scanner scan = new Scanner(System.in);
	
	public Farmacia (String[]nm, int[]DPV, double[] p) {
		this.nomeMedicamentos = nm;
		this.DiasParaVencimento = DPV;
		this.precos = p;
	}
	public void mostrar() {
		for (int i=0; i < nomeMedicamentos.length; i++) {
			System.out.println("nome: "+ nomeMedicamentos[i]);
			System.out.println("preco: "+ precos[i]);
			System.out.println("vencimento: "+ DiasParaVencimento[i] + " Dias");
		}
	}
	public void CalcularMediaDias() {
		int soma = 0;
		int media = 0;
		for (int i = 0; i < DiasParaVencimento.length; i++) {
			soma = soma + DiasParaVencimento[i];
		}
		media = soma/DiasParaVencimento.length;
		System.out.println("Média: " + media);
	}
	public void ProxVencimento() {
		for (int i = 0; i< DiasParaVencimento.length; i++) {
			if (DiasParaVencimento[i] <= 5) {
				System.out.println(nomeMedicamentos[i]);
			}
		}
	}
	public void Desconto() {
		for (int i= 0; i < DiasParaVencimento.length; i++) {
			if(DiasParaVencimento[i] <= 5) {
				precos[i] = precos[i] * 0.5;
			}
		}
		System.out.println("Desconto aplicado!");
	}
	public void venda() {
		String opcao = "";
		System.out.println("Digite o nome do medicamento");
		opcao = scan.next();
		for (int i = 0; i<nomeMedicamentos.length; i++) {
			if (opcao.equals(nomeMedicamentos[i])) {
				nomeMedicamentos[i]= "";
				DiasParaVencimento[i]= 0;
				precos[i]= 0;
			}
		}
		System.out.println("Compra realizada!");
	}

}
